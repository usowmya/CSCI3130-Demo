package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText input;
    private TextView text;
    private Button copy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.editText);
        copy = findViewById(R.id.button);
        text = findViewById(R.id.textView);

        copy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String content = input.getText().toString();
                text.setText(content);


            }


        });


    }
}
