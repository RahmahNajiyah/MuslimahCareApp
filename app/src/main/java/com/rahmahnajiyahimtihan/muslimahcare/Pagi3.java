package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pagi3 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPagi3 adapterPagi3;

    String[] isi={
      String.valueOf(R.string.serum), String.valueOf(R.string.serumway)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi3);

        viewPager = (ViewPager) findViewById(R.id.pager3);
        adapterPagi3 = new AdapterPagi3(getApplicationContext(), isi);
        viewPager.setAdapter(adapterPagi3);
    }
}
