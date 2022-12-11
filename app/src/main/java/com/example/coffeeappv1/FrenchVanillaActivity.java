package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class FrenchVanillaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_vanilla);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void buttonPressDecaffeinatedVanillaNutCream(View view) {
        Intent intent = new Intent(this, DecaffeinatedVanillaNutCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressVanillaNutCream(View view) {
        Intent intent = new Intent(this, VanillaNutCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressMidnightRoyale(View view) {
        Intent intent = new Intent(this, MidnightRoyaleActivity.class);
        startActivity(intent);
    }

    public void buttonPressCinnamonNutSugarCookie(View view) {
        Intent intent = new Intent(this, CinnamonNutSugarCookieActivity.class);
        startActivity(intent);
    }

    public void buttonPressVanillaMacadamiaNut(View view) {
        Intent intent = new Intent(this, VanillaMacadamiaNutActivity.class);
        startActivity(intent);
    }
}
