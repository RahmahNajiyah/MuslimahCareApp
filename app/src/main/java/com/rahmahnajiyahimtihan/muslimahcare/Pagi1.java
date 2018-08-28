package com.rahmahnajiyahimtihan.muslimahcare;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Pagi1 extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPagi1 adapter;

    String[] isi = {
          String.valueOf(R.string.cleanser), String.valueOf(R.string.cleansingpencucimuka), String.valueOf(R.string.cleanway)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi1);

        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new AdapterPagi1(getApplicationContext(), isi);
        viewPager.setAdapter(adapter);

    }
}
