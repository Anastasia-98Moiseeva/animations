package com.example.animations;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class ObjectAnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_animation);

        final ImageView imageView = findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animate(imageView);
            }
        });
    }

    public void animate(ImageView imageView){
        ObjectAnimator scaleXanimator = ObjectAnimator.ofFloat(imageView, "scaleX", 0.5f, 1f);
        ObjectAnimator scaleYanimator = ObjectAnimator.ofFloat(imageView, "scaleY", 0.5f, 1f);
        configure(scaleXanimator).start();
        configure(scaleYanimator).start();
    }

    private Animator configure(ObjectAnimator animator) {
        animator.setDuration(700);
        animator.setRepeatMode(ObjectAnimator.REVERSE);
        animator.setRepeatCount(10);
        return animator;
    }
}
