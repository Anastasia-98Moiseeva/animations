package com.example.animations;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_animation);

        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_scale_rotate);
        final ImageView imageView = findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.clearAnimation();
                imageView.startAnimation(animation);
            }
        });
    }
}
