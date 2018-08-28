package com.rahmahnajiyahimtihan.muslimahcare;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Toast.makeText(this, "Assalaamu'alaikum sobat muslimah\n            by Rahmah najiyah i.", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();

                Toast.makeText(SplashScreen.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
