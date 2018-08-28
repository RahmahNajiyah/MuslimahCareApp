package com.rahmahnajiyahimtihan.muslimahcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    Button steppagi, stepmalem, cek, tambahan, klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        steppagi = (Button) findViewById(R.id.btnpagi);
        cek = (Button) findViewById(R.id.btncek);
        stepmalem = (Button) findViewById(R.id.btnmalem);
        tambahan = (Button) findViewById(R.id.btntambahan);
        klik = (Button) findViewById(R.id.btnkenali);


        steppagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagi = new Intent(getApplicationContext(), Morningstep.class);
                startActivity(pagi);
            }
        });
        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cek = new Intent(getApplicationContext(), Cekkulit.class);
                startActivity(cek);
            }
        });
        stepmalem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stepmalem = new Intent(getApplicationContext(), Nightstep.class);
                startActivity(stepmalem);
            }
        });
        tambahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tmbh = new Intent(getApplicationContext(), Tambahan.class);
                startActivity(tmbh);
            }
        });
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplicationContext(), Klik.class);
                startActivity(k);

            }
        });


    }
}
