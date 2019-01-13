package com.lambdaschool.rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button       buttonDemo;
    LinearLayout layoutBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutBackground = findViewById(R.id.layout_background);
        buttonDemo = findViewById(R.id.blueButton_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Demo" , "The demo button was clicked!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));

        layoutBackground =findViewById(R.id.layout_background);
        buttonDemo =findViewById(R.id.greenButton_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Demo", "The demo button was clicked!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));

        layoutBackground =findViewById(R.id.layout_background);
        buttonDemo =findViewById(R.id.orangeButton_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Demo" , "The demo button was clicked!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));

        layoutBackground =findViewById(R.id.layout_background);
        buttonDemo =findViewById(R.id.purpleButton_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Demo" , "The demo button was clicked!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));

        layoutBackground =findViewById(R.id.layout_background);
        buttonDemo =findViewById(R.id.redButton_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Demo" , "The demo button was clicked!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));

        layoutBackground =findViewById(R.id.layout_background);
        buttonDemo =findViewById(R.id.grayButton_demo);
        buttonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Demo" , "The demo button was clicked!");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
            }
        });
            }
        });

            }
        });
            }
        });
            }
        });
            }
        });
    }
}
