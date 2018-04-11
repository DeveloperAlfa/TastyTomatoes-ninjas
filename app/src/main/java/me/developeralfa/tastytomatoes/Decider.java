package me.developeralfa.tastytomatoes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Decider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decider);
        SharedPreferences sharedPreferences = getSharedPreferences("run",MODE_PRIVATE);
        if(!sharedPreferences.contains("ran")) {
            startActivity(new Intent(this, Slider.class));
            SharedPreferences.Editor e = sharedPreferences.edit();
            e.putString("ran","ran");
            e.apply();
            finish();
        }
        else
        {
            startActivity(new Intent(this,Login.class));
            finish();
        }
    }
}
