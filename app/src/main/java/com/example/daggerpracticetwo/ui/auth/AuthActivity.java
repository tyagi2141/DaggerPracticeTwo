package com.example.daggerpracticetwo.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.example.daggerpracticetwo.R;
import com.example.daggerpracticetwo.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {


    @Inject
    RequestManager requestManager;

    @Inject
    Drawable image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /* TextView nameTv = findViewById(R.id.name_id);
        nameTv.setText(name);*/

        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requestManager.load(image).into((ImageView)findViewById(R.id.image));
            }
        });

    }
}
