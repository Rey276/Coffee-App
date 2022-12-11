package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class HazelnutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hazelnut);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressDecaffeinatedHazelnut(View view) {
        Intent intent = new Intent(this, DecaffeinatedHazelnutActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonFrangelico(View view) {
        Intent intent = new Intent(this, CinnamonFrangelicoActivity.class);
        startActivity(intent);
    }

    public void buttonPressChocolateMacadamiaNut(View view) {
        Intent intent = new Intent(this, ChocolateMacadamiaNutActivity.class);
        startActivity(intent);
    }

    public void buttonPressEspressoNuovo(View view) {
        Intent intent = new Intent(this, EspressoNuovoActivity.class);
        startActivity(intent);
    }

    public void buttonPressDecaffeinatedVanillaNutCream(View view) {
        Intent intent = new Intent(this, DecaffeinatedVanillaNutCreamActivity.class);
        startActivity(intent);
    }
}
