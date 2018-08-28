package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pagi2 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPagi2 adapter;

    String[] isi= {
      String.valueOf(R.string.toner), String.valueOf(R.string.tonerway)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi2);

        viewPager = (ViewPager) findViewById(R.id.pager2);
        adapter = new AdapterPagi2(getApplicationContext(), isi);
        viewPager.setAdapter(adapter);
    }
}
