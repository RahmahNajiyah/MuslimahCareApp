package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi5 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPagi5 adapterPagi5;

    String[] isi={
            String.valueOf(R.string.sun), String.valueOf(R.string.sunway)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi5);

        viewPager = (ViewPager) findViewById(R.id.pager5);
        adapterPagi5 = new AdapterPagi5(getApplicationContext(), isi);
        viewPager.setAdapter(adapterPagi5);
    }
}
