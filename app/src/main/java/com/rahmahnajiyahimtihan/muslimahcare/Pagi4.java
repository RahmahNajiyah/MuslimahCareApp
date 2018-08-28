package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi4 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPagi4 adapterPagi4;

    String[] isi={
           String.valueOf(R.string.pelembab), String.valueOf(R.string.kenalipelembab), String.valueOf(R.string.pelembabway)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi4);

        viewPager = (ViewPager) findViewById(R.id.pager4);
        adapterPagi4 = new AdapterPagi4(getApplicationContext(), isi);
        viewPager.setAdapter(adapterPagi4);
    }
}
