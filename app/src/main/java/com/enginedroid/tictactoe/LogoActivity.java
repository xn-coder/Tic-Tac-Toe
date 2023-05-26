package com.enginedroid.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LogoActivity extends AppCompatActivity {

    private ImageView imageView;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        imageView = findViewById(R.id.logo);

        Intent home = new Intent(LogoActivity.this, MainActivity.class);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_anim);
        imageView.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
                finish();
            }
        }, 4000);
    }
}