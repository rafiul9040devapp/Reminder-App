package com.rafiul.reminderapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rafiul.reminderapp.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}