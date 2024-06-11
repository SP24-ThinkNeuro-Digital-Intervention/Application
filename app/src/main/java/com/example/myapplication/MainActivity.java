package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHomeClick(View view) {
        // Handle Home button click
        // This is where you'd handle the click for the home button
    }

    public void onArticlesClick(View view) {
        // Handle Articles button click
        Intent intent = new Intent(this, ArticlesActivity.class);
        startActivity(intent);
    }

    public void onMapsClick(View view) {
        // Handle Maps button click
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void onSettingsClick(View view) {
        // Handle Settings button click
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}