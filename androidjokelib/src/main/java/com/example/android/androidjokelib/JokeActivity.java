package com.example.android.androidjokelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Bundle extras = getIntent().getExtras();
        String jokeString = extras.getString(getString(R.string.joke_string_extra_key));

        TextView textViewJoke = findViewById(R.id.textview_joke);
        textViewJoke.setText(jokeString);
    }
}
