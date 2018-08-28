package com.rahmahnajiyahimtihan.muslimahcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Morningstep extends AppCompatActivity {

    Button cleanser, toner, serum, pelembab, sun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morningstep);

        cleanser = (Button) findViewById(R.id.btncleanser);
        toner = (Button) findViewById(R.id.btnToner);
        serum = (Button) findViewById(R.id.btnSerum);
        pelembab = (Button) findViewById(R.id.btnPelembab);
        sun = (Button) findViewById(R.id.btnSun);

        cleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Pagi1.class);
                startActivity(a);
            }
        });

        toner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(), Pagi2.class);
                startActivity(b);
            }
        });

        serum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getApplicationContext(), Pagi3.class);
                startActivity(c);
            }
        });
        pelembab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(getApplicationContext(), Pagi4.class);
                startActivity(d);
            }
        });

        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplicationContext(), Pagi5.class);
                startActivity(e);
            }
        });

        Toast.makeText(this, "Geser halaman ketika anda selesai mengklik masing-masing step", Toast.LENGTH_SHORT).show();
    }
}
