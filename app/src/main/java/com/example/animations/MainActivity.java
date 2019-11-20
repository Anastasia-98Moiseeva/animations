package com.example.animations;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.animations.AnimationDrawableActivity;
import com.example.animations.R;
import com.example.animations.ValueAnimationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleClick(R.id.animation_drawable, AnimationDrawableActivity.class);
        handleClick(R.id.view_animation, ViewAnimationActivity.class);
        handleClick(R.id.value_animation, ValueAnimationActivity.class);
        handleClick(R.id.object_drawable, ObjectAnimationActivity.class);
        handleClick(R.id.custom_drawable, CustomViewAnimationActivity.class);
    }

    private void handleClick(@IdRes int viewId, final Class<? extends Activity> activityClass) {
        findViewById(viewId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activityClass));
            }
        });
    }
}
