
package com.example.teju.plletechcoursecontent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public String[] str={"Full_dot_net","Csharp for freshers","Csharp for professionals","SQL server for freshers","SQL server for experienced"};
    public  String[] str1={"Duration: 37 hours\nAssignments: 18 hours\nTests: 32 hours",
                    "Duration: 35 hours\nAssignments: 11 hours\n+Tests: 40 hours",
                    "Duration: 29 hours\nAssignments: 15 hours\nTests: 34 hours",
                    "Duration: 42 hours\nAssignments: 23 hours\nTests: 45 hours",
                    "Duration: 36 hours\nAssignments: 22 hours\nTests: 38 hours"};

    TextView tv;
    String[] str2=new String[3];
    ArrayList<String> al1,al2,al3;
    MyAdaptor adaptor;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView) findViewById(R.id.listview);
        adaptor=new MyAdaptor();
        lv.setAdapter(adaptor);

        adaptor.notifyDataSetChanged();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("pos",position);
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });



    }
    public class MyAdaptor extends BaseAdapter {
        @Override
        public int getCount() {
            return str.length;
        }

        @Override
        public Object getItem(int position) {
            return str[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View v=getLayoutInflater().inflate(R.layout.row1,null);
            TextView tv1= (TextView) v.findViewById(R.id.textview1);
            TextView tv2= (TextView) v.findViewById(R.id.textview2);
            tv1.setText(str[position]);
            tv2.setText(str1[position]);


            return v;
        }
    }
}

