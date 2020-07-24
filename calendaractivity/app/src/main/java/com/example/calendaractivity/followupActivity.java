package com.example.calendaractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

class followupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent != null) {
            int year = intent.getIntExtra("year", 2020);
            int month = intent.getIntExtra("month", 8);
            int dayOfMonth = intent.getIntExtra("dayOfMonth", 1);
        }

    }
}