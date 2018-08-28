package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Malam4 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterMalam4 adapterMalam4;

    String[] isi= {
        String.valueOf(R.string.malam4), String.valueOf(R.string.malam4way)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malam4);

        viewPager = (ViewPager) findViewById(R.id.pagerm4);
        adapterMalam4 = new AdapterMalam4(getApplicationContext(), isi);
        viewPager.setAdapter(adapterMalam4);
}
}
