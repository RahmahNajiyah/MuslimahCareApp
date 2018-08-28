package com.rahmahnajiyahimtihan.muslimahcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Nightstep extends AppCompatActivity {

    Button m1, m2, m3, m4, m5, m6, m7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nightstep);

        m1 = (Button) findViewById(R.id.btnremover);
        m2 = (Button) findViewById(R.id.btncleanmalam);
        m3 = (Button) findViewById(R.id.btntonermalam);
        m4 = (Button) findViewById(R.id.btneye);
        m5 = (Button) findViewById(R.id.btnspecial);
        m6 = (Button) findViewById(R.id.btnserummalam);
        m7 = (Button) findViewById(R.id.btnnight);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m1 = new Intent(getApplicationContext(), Malam1.class);
                startActivity(m1);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m2 = new Intent(getApplicationContext(), Malam2.class);
                startActivity(m2);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m3 = new Intent(getApplicationContext(), Malam3.class);
                startActivity(m3);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m4 = new Intent(getApplicationContext(), Malam4.class);
                startActivity(m4);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m5 = new Intent(getApplicationContext(), Malam5.class);
                startActivity(m5);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m6 = new Intent(getApplicationContext(), Malam6.class);
                startActivity(m6);
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m7 = new Intent(getApplicationContext(), Malam7.class);
                startActivity(m7);
            }
        });

        Toast.makeText(this, "Geser halaman ketika anda selesai mengklik masing-masing step", Toast.LENGTH_SHORT).show();
    }
}
