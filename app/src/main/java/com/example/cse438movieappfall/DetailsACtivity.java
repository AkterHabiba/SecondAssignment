package com.example.cse438movieappfall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsACtivity extends AppCompatActivity {

    Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        result = (Result) getIntent().getSerializableExtra("result");

        ImageView imageView = findViewById(R.id.posterflash);
        TextView textView=findViewById(R.id.title1);
        String mTitle=result.getTitle();
//        View result=findViewById(R.id.title1);
       // Glide.with(this).load(mTitle);
        boolean mPoster;
        if (result.isVideo()) mPoster = true;
        else mPoster = false;
        Glide.with(this).load(mPoster);
        Glide.with(this).load("title1");




    }
}