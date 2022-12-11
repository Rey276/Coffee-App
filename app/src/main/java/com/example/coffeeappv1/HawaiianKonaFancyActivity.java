package com.example.coffeeappv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class HawaiianKonaFancyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hawaiian_kona_fancy);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
    
    public void buttonPressOrganicPeru(View view) {
        Intent intent = new Intent(this, OrganicPeruActivity.class);
        startActivity(intent);
    }

    public void buttonPressEthiopiaMoka(View view) {
        Intent intent = new Intent(this, EthiopiaMokaActivity.class);
        startActivity(intent);
    }

    public void buttonPressHawaiianGoldenBlend(View view) {
        Intent intent = new Intent(this, HawaiianGoldenBlendActivity.class);
        startActivity(intent);
    }

    public void buttonPressColombiaFrench(View view) {
        Intent intent = new Intent(this, ColombiaFrenchActivity.class);
        startActivity(intent);
    }

    public void buttonPressIslandBlend(View view) {
        Intent intent = new Intent(this, IslandBlendActivity.class);
        startActivity(intent);
    }
}
