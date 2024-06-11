package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ArticlesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        // Button click listeners
        Button homeButton = findViewById(R.id.button_home);
        Button articlesButton = findViewById(R.id.button_articles);
        Button mapsButton = findViewById(R.id.button_maps);
        Button settingsButton = findViewById(R.id.button_settings);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle home button click, navigate to HomeActivity if needed
            }
        });

        articlesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle articles button click, do necessary action or navigate to another activity
            }
        });

        mapsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle maps button click, navigate to MapsActivity if needed
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle settings button click, navigate to SettingsActivity if needed
            }
        });
    }
}
