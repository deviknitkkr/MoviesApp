package com.vikas.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setSubtitle("Based on TMDB");
    }
}
