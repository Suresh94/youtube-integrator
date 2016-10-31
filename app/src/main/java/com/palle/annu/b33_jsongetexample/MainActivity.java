package com.palle.annu.b33_jsongetexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DynamicFragment dynamicFragment = new DynamicFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().add(R.id.container,dynamicFragment);
        ft.commit();

    }
}
