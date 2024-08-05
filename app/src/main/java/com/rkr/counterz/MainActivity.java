package com.rkr.counterz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.counter_text);
        var incrementButton = findViewById(R.id.increment_button);
        var decrementButton = findViewById(R.id.decrement_button);

        incrementButton.setOnClickListener(v -> {
            count++;
            counterText.setText(String.valueOf(count));
        });

        decrementButton.setOnClickListener(v -> {
            count--;
            counterText.setText(String.valueOf(count));
        });
    }
}