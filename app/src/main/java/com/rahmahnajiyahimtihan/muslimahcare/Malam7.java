package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Malam7 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterMalam7 adapterMalam7;

    String[] isi = {
      String.valueOf(R.string.malam7), String.valueOf(R.string.malam7way)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malam7);

        viewPager = (ViewPager) findViewById(R.id.pager7);
        adapterMalam7 = new AdapterMalam7(getApplicationContext(), isi);
        viewPager.setAdapter(adapterMalam7);
    }
}
