package me.developeralfa.tastytomatoes;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Slider extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("Tomatoes as they hit the screen","Reviews and popcorn straight from the critic's pen",R.drawable.pen,getResources().getColor(R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("Make this app your own","Login with Facebook and binge with your friends",R.drawable.fb,getResources().getColor(R.color.beige)));
        addSlide(AppIntroFragment.newInstance("Seat? Tomato.","We'll place a tomato on the seat, watch your pants! ",R.drawable.seat,getResources().getColor(R.color.colorPrimaryDark)));

        addSlide(AppIntroFragment.newInstance("Voice Search","Everything is so voice-enabled these days! Geez.",R.drawable.mic,getResources().getColor(R.color.beige)));
        addSlide(AppIntroFragment.newInstance("TV Series tracker","Well unless you're an one night season machine, we have an episode tracker inbuilt!",R.drawable.tick,getResources().getColor(R.color.colorPrimaryDark)));

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(this,Login.class));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(this,Login.class));
    }
}
