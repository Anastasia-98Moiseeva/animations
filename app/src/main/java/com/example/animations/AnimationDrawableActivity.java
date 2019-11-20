package com.example.animations;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnimationDrawableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_drawable);
        final ImageView imageView = findViewById(R.id.img);
        ((AnimationDrawable) imageView.getDrawable()).start();
    }
}
