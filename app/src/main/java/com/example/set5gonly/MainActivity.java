package com.example.set5gonly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.set5gButton);

        // Set OnClickListener for the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the RadioInfo settings activity
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo");
                startActivity(intent);
            }
        });
    }
}
