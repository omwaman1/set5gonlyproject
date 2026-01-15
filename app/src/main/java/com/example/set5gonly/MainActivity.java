package com.example.set5gonly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get views
        View set5gButton = findViewById(R.id.set5gButton);
        TextView versionText = findViewById(R.id.versionText);

        // Set version text
        versionText.setText("v" + BuildConfig.VERSION_NAME);

        // Animate button
        set5gButton.setAlpha(0f);
        set5gButton.setTranslationY(30f);
        set5gButton.animate()
                .alpha(1f)
                .translationY(0f)
                .setDuration(400)
                .setStartDelay(300)
                .start();

        // Set OnClickListener for the button
        set5gButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Button press animation
                view.animate()
                        .scaleX(0.96f)
                        .scaleY(0.96f)
                        .setDuration(80)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                view.animate()
                                        .scaleX(1f)
                                        .scaleY(1f)
                                        .setDuration(80)
                                        .start();

                                // Start the RadioInfo settings activity
                                Intent intent = new Intent("android.intent.action.MAIN");
                                intent.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo");
                                startActivity(intent);
                            }
                        })
                        .start();
            }
        });
    }
}
