package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//when user click on the submit button
public void displayMessage(View view) {
    EditText editText = (EditText) findViewById(R.id.editText);
    String message = "Hello , "+editText.getText().toString();

    TextView textView = findViewById(R.id.textView);
    textView.setText(message);
}
}

