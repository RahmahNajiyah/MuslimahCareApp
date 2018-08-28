package com.rahmahnajiyahimtihan.muslimahcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tambahan extends AppCompatActivity {

    Button ex, holi, tepuk, mask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahan);

        ex = (Button) findViewById(R.id.btnex);
        holi = (Button) findViewById(R.id.btnholi);
        tepuk = (Button) findViewById(R.id.btntepuk);
        mask = (Button) findViewById(R.id.btnmask);

        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Ex.class);
                startActivity(a);
            }
        });
        holi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(), Holi.class);
                startActivity(b);
            }
        });
        tepuk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent c = new Intent(getApplicationContext(), Tepuk.class);
            startActivity(c);
        }
    });

        mask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Masker.class);
                startActivity(l);
            }
        });
    }
}

