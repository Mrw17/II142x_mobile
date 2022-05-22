package com.example.ii142x;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HeartBeatActivity extends Activity {

    private TextView textViewHeartBeat;
    private Button btnHeartBeat;
    private Button btnBackToMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_beat);

        setUpGUI();
    }

    private void setUpGUI() {
        btnHeartBeat = findViewById(R.id.btnStartHeartBeat);
        btnHeartBeat.setOnClickListener(v-> readHeartBeatBtnPressed());

        btnBackToMainActivity = findViewById(R.id.btnBackMainActivity);
        btnBackToMainActivity.setOnClickListener(v-> sendUserToMainActivity());

        textViewHeartBeat = findViewById(R.id.textViewHeartBeat);
    }

    private void readHeartBeatBtnPressed() {
    }

    private void sendUserToMainActivity() {
    }
}