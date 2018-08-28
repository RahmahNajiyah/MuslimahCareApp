package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Malam1 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterMalam1 adapterMalam1;

    String[] isi= {
      String.valueOf(R.string.malam1),String.valueOf(R.string.memilihcreammalam), String.valueOf(R.string.malam1way)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malam1);

        viewPager = (ViewPager) findViewById(R.id.pagerm1);
        adapterMalam1 = new AdapterMalam1(getApplicationContext(), isi);
        viewPager.setAdapter(adapterMalam1);
    }
}
