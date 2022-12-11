package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class HotButteredRumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_buttered_rum);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    
    public void buttonPressKahluaCream(View view) {
        Intent intent = new Intent(this, KahluaCreamActivity.class);
        startActivity(intent);
    }

    public void buttonPressEspressoNuovo(View view) {
        Intent intent = new Intent(this, EspressoNuovoActivity.class);
        startActivity(intent);
    }

    public void buttonPressViennaDark(View view) {
        Intent intent = new Intent(this, ViennaDarkActivity.class);
        startActivity(intent);
    }

    public void buttonPressFrenchRoastDarkItalian(View view) {
        Intent intent = new Intent(this, FrenchRoastDarkItalianActivity.class);
        startActivity(intent);
    }

    public void buttonPressChocolateMacadamiaNut(View view) {
        Intent intent = new Intent(this, ChocolateMacadamiaNutActivity.class);
        startActivity(intent);
    }
}
