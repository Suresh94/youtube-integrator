package com.palle.annu.b33_jsongetexample;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DynamicFragment extends Fragment {

    //Declare al variable
    Button bGet;
    TextView tv_id, tv_name, tv_email, tv_mobile;
    ArrayList<MyBeanCLass> al;
    DynamicFragment dynamicFragment;
    MyTask myTask;
    MyAdapter myAdapter;
    ListView lv;

    public DynamicFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dynamic, container, false);
        bGet = (Button) v.findViewById(R.id.button_get);
        tv_id = (TextView) v.findViewById(R.id.text_id);
        tv_name = (TextView) v.findViewById(R.id.text_name);
        tv_email = (TextView) v.findViewById(R.id.text_email);
        tv_mobile = (TextView) v.findViewById(R.id.text_phone);
        lv = (ListView) v.findViewById(R.id.listView1);
        al = new ArrayList<MyBeanCLass>();
        myAdapter = new MyAdapter();
        myTask = new MyTask();
        lv.setAdapter(myAdapter);
        bGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkInternet() == true) {
                    myTask.execute("http://api.androidhive.info/contacts/");
                } else {
                    //DISPLAY A DIALOG SAYING "NO INTERNET,PLZ CHECK"
                    Toast.makeText(getActivity(), "No Internet", Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;
    }

    public boolean checkInternet() {
        ConnectivityManager c = (ConnectivityManager)
                getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        if (c != null) {
            NetworkInfo networkInfo = c.getActiveNetworkInfo();
            if (networkInfo != null) {
                if (networkInfo.isConnected() == false) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }


    //step9. Create 2 inner class

    // Required empty public constructor
    //For Aync Task
    public class MyTask extends AsyncTask<String, Void, String> {
        //declare al variables
        URL myurl;
        HttpURLConnection connection;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        String line;
        StringBuilder stringBuilder;
        //13.Implement do in background, connect to servrer ,,get JSON and return

        @Override
        protected String doInBackground(String... p1) {
            try {
                myurl = new URL(p1[0]);
                connection = (HttpURLConnection) myurl.openConnection();
                inputStream = connection.getInputStream();
                inputStreamReader = new InputStreamReader(inputStream);
                bufferedReader = new BufferedReader(inputStreamReader);
                stringBuilder = new StringBuilder();
                line = bufferedReader.readLine();
                while (line != null) {
                    stringBuilder.append(line);
                    line = bufferedReader.readLine();
                }
                return stringBuilder.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                Log.d("tagline", "Message.." + e.getMessage());
                Log.e("tagline", "Cause.." + e.getCause());
                e.printStackTrace();// prints complete info about error.
            } finally {
                //clean important resources = eg:closing all network connection
                if (connection != null) {
                    connection.disconnect();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                            }
                        } catch (IOException e) {
                            Log.d("B33", "PROBLEM IN CLOSING CONNECTION");
                            e.printStackTrace();
                        }
                    }
                }
            }

            return null;
        }

        //step14. onPost execute for parsing JSON

        @Override
        protected void onPostExecute(String s) {
            if (s == null) {
                Toast.makeText(getActivity(), "Network isuue,FIX", Toast.LENGTH_LONG).show();
                return;
            }
            //START JSON PARSING
            try {
                JSONObject j = new JSONObject(s);
                JSONArray arr = j.getJSONArray("contacts");
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject temp = arr.getJSONObject(i);
                    String name = temp.getString("name");
                    String email = temp.getString("email");
                    JSONObject phone = temp.getJSONObject("phone");
                    String mobile = phone.getString("mobile");
                    //with this we got on object
                    MyBeanCLass myBeanCLass = new MyBeanCLass();
                    myBeanCLass.setCno("" + (i + 1));
                    myBeanCLass.setCname(name);
                    myBeanCLass.setCemail(email);
                    myBeanCLass.setCmobile(mobile);
                    //push to arraylist
                    al.add(myBeanCLass);
                    //Notify Adapter
                    myAdapter.notifyDataSetChanged();


                }

            } catch (JSONException e) {
                Log.d("tagline", "JSON EXCEPTION.." + e.getMessage());
                e.printStackTrace();
            }

            super.onPostExecute(s);

        }
    }


    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return al.size();
        }

        @Override
        public Object getItem(int position) {
            return al.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //a.based on position read contacts objetcs from arraylist
            MyBeanCLass myBeanCLass = al.get(position);
            //b.load row.xml and all other views
            View v = getActivity().getLayoutInflater().inflate(R.layout.row,null);
            TextView tv1 = (TextView)v.findViewById(R.id.text_id);
            TextView tv2 = (TextView)v.findViewById(R.id.text_name);
            TextView tv3 = (TextView)v.findViewById(R.id.text_email);
            TextView tv4 = (TextView)v.findViewById(R.id.text_phone);
            //c.fill data onto text view -Using getters
            tv1.setText(myBeanCLass.getCno());
            tv2.setText(myBeanCLass.getCname());
            tv3.setText(myBeanCLass.getCemail());
            tv4.setText(myBeanCLass.getCmobile());

            //return row.xml that is a view v
            return v;
        }
    }
}