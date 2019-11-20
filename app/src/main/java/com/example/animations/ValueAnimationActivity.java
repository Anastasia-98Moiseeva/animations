package com.example.animations;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ValueAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.value_animation);

        final ImageView imageView = findViewById(R.id.img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animate(imageView);
            }
        });
    }

    private void animate(final ImageView imageView){
        ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0f, 1f);
        alphaAnimator.setDuration(700);
        alphaAnimator.setRepeatCount(10);
        alphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                imageView.setAlpha((Float) animation.getAnimatedValue());
            }
        });
        alphaAnimator.start();
    }
}
