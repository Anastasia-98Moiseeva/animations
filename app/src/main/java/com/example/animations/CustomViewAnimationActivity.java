package com.example.animations;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomViewAnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_view_animation);

        View view = findViewById(R.id.finance_progress);
        ObjectAnimator animator = ObjectAnimator.ofInt(view, "progress", 1, 100);
        animator.setRepeatMode(ObjectAnimator.RESTART);
        animator.setDuration(2000);
        animator.setInterpolator(new LinearInterpolator());
        animator.start();
    }
}
