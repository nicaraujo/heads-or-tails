package com.projects.headsortails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        button = findViewById(R.id.button);
        Bundle data = getIntent().getExtras();
        num = data.getInt("numero");
        imageView = findViewById(R.id.imageView2);
        if (num == 0) {
            imageView.setImageResource(R.drawable.moeda_cara);
        }
        else {
            imageView.setImageResource(R.drawable.moeda_coroa);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                finish();
            }
        });
    }
}