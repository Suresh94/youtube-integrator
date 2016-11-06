package com.example.teju.plletechcoursecontent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {



    String[] full_dot_net={ "C# program compilation/ltgDdukzQ7I/18:47",
         "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
           "C# class as virtual entity/HSdIq3k51bg/9:15",
           "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"};
     String[] csharp_freshers_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "C# data types/L_gFuuSp4V0/17:53",
            "C# class/l1C4FZGCab0/10:48",
            "C# class as virtual entity/HSdIq3k51bg/9:15",
            "Objects in c#/SM_QqUdMXY0/22:14",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "C# Arrays/CLnA6OAlNPk/24:50",
            "Declaring and Modifying data in c# arrays/O2QI3YFupxM/9:06",
            "Arrays Assignment/Zt85ireWQWw/7:49",
            "Loops/u_k75WcEpHM/5:51",
            "for-loop/isSp9xjw0LQ/23:46",
            "C# Strings/MGCZ8AHhwDA/21:02",
            "Constructors/5h8Tu68VXsI/5:08",
            "Problems When Constructor is Not Used/Yij6AUta4yI/19:41",
            "Constructors Example/Gr6qsjTIifA/21:07",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52"};
    String[] csharp_exp_demo_videos = {
            "C# program compilation/ltgDdukzQ7I/18:47",
            "Debugging in visual studio/8hXH5HxQfFU/10:41",
            "Inheritence/TOBLe0qoA_o/9:24",
            "Inheritence Part 2/T7G8NFXDXFE/24:07",
            "base keyword/WaAbIMz2dqg/22:08",
            "Overriding Intro/w6ldKhR4YUs/23:31",
            "overriding an override method/fdPslUmRqm0/12:52",
            "Static Variables/zvk_hS4vEOw/9:27",
            "what is the use of properties in c#/UdiU6sp68Tc/16:16",
            "c# properties/5nHmt5Zi7l8/15:03",
            "c# constants/9_fH7R6rPaU/8:57",
            "Constants Part 2/Wn20d0KBk1o/8:22",
            "Read only variables/YfYkswfGo_k/9:27",
            "Params Keyword/wZ_bBpsd10o/16:27",
            "Exceptions/wBxVpzaTXkc/17:16",
            "Exception Handling Part 2/mTF-ct2IkGU/9:25",
            "GC Terminology/eyytXkQqOV0/17:16",
            "Dead objects/YZyKaiM5kuc/8:29",
            "GC Working mechanisam/v-VTR9Xm6Vk/9:51",
            "C# Generics/-xfzPrvKFL0/10:09",
            "C# Generics and Reusability/7g9aPw1kI1o/15:32",
            "C# Delegates/k0evYKS62Tg/7:27",
            "C# Delegates example/Vjc9UHV6tTM/22:38"
    };
    String[] sql_server_freshers_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:09"
    };
    private String[] sql_server_exp_demo_videos = {
            "SQLServer Overview/Kdc84lpF4GM/16:25",
            "Normalization/7Dc7_I48ZTg/14:30",
            "Orderby clause/quuwLXzZl3g/6:59",
            "Delete drop and truncate statements/yZNyUzSMsT8/6:58",
            "Aggregate Functions/2IYykxAXaB8/13:54",
            "Group by clause/qx0j5iWajqg/20:22",
            "Joins and Inner Join with simple explanation/i0vwTFFHTU8/33:02",
            "stored procedure/jmZsXlAYe7Y/17:11",
            "User defined functions in sql/8cJFtDESxiQ/9:01",
            "Indexes/hrVpqW_Bh2o/21:19"
    };

    String[] str2=new String[3];
    ArrayList<String> al1,al2,al3;
    MyAdaptor adaptor;
    ListView lv;
    TextView tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //tv= (TextView) findViewById(R.id.textview);
        lv= (ListView) findViewById(R.id.listview);
        tv5= (TextView) findViewById(R.id.textview5);
        al1=new ArrayList<String>();
        al2=new ArrayList<String>();
        al3=new ArrayList<String>();
        adaptor= new MyAdaptor();
        Intent intent=getIntent();
        Bundle b=intent.getExtras();
        int x=b.getInt("pos");
        if(x==0){
        tv5.setText("full dot net");
        for(int j=0; j<full_dot_net.length-1 ;j++)
        {
            {
                String[] str1 = full_dot_net[j].split("/");
                for (int i = 0; i <= 2; i++) {
                    if(i==0) {
                        str2[i] = str1[i];
                        al1.add(str2[i]);
                        adaptor.notifyDataSetChanged();
                        //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                    }
                    if(i==1) {
                        str2[i] = str1[i];
                        al2.add(str2[i]);
                        adaptor.notifyDataSetChanged();
                       // Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                    }
                    if(i==2) {
                        str2[i] = str1[i];
                        al3.add(str2[i]);
                        adaptor.notifyDataSetChanged();
                        //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                    }


                }}

        }}
        else if(x==1){
            tv5.setText("csharp freshers");
            for(int j=0; j<=csharp_freshers_demo_videos.length-1 ;j++)
            {
                {
                    String[] str1 = csharp_freshers_demo_videos[j].split("/");
                    for (int i = 0; i <= 2; i++) {
                        if(i==0) {
                            str2[i] = str1[i];
                            al1.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==1) {
                            str2[i] = str1[i];
                            al2.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==2) {
                            str2[i] = str1[i];
                            al3.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                           // Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }


                    }}

            }

        }
        else if(x==2){
            tv5.setText("csharp experience");
            for(int j=0; j<=csharp_exp_demo_videos.length-1 ;j++)
            {
                {
                    String[] str1 = csharp_exp_demo_videos[j].split("/");
                    for (int i = 0; i <= 2; i++) {
                        if(i==0) {
                            str2[i] = str1[i];
                            al1.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==1) {
                            str2[i] = str1[i];
                            al2.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==2) {
                            str2[i] = str1[i];
                            al3.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }


                    }}

            }

        }
        else if(x==3){
            tv5.setText("sql server freshers");
            for(int j=0; j<=sql_server_freshers_demo_videos.length-1 ;j++)
            {
                {
                    String[] str1 = sql_server_freshers_demo_videos[j].split("/");
                    for (int i = 0; i <= 2; i++) {
                        if(i==0) {
                            str2[i] = str1[i];
                            al1.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==1) {
                            str2[i] = str1[i];
                            al2.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==2) {
                            str2[i] = str1[i];
                            al3.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }


                    }}

            }

        }
        else if(x==4){
            tv5.setText("sql server exp");
            for(int j=0; j<=sql_server_exp_demo_videos.length-1 ;j++)
            {
                {
                    String[] str1 = sql_server_exp_demo_videos[j].split("/");
                    for (int i = 0; i <= 2; i++) {
                        if(i==0) {
                            str2[i] = str1[i];
                            al1.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                           // Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==1) {
                            str2[i] = str1[i];
                            al2.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }
                        if(i==2) {
                            str2[i] = str1[i];
                            al3.add(str2[i]);
                            adaptor.notifyDataSetChanged();
                            //Toast.makeText(this, "01", Toast.LENGTH_SHORT).show();
                        }


                    }}

            }

        }else{}
        lv.setAdapter(adaptor);





    }
    public class MyAdaptor extends BaseAdapter{
        @Override
        public int getCount() {
            return al1.size();
        }

        @Override
        public Object getItem(int position) {
            return al1.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {


            View v=getLayoutInflater().inflate(R.layout.row,null);
            TextView tv1= (TextView) v.findViewById(R.id.textview1);
            TextView tv2= (TextView) v.findViewById(R.id.textview2);
            TextView tv3= (TextView) v.findViewById(R.id.textview3);
            Button btn= (Button) v.findViewById(R.id.button);

            tv2.setText(al1.get(position));
            tv1.setText(""+position);
            tv3.setText(al3.get(position));

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                    Toast.makeText(Main2Activity.this, "poi"+position, Toast.LENGTH_SHORT).show();
                    i.putExtra("str",al2.get(position));
                    Toast.makeText(Main2Activity.this, al2.get(position), Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
            });

            return v;
        }
    }
}
