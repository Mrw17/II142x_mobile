package com.example.ii142x;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.example.ii142x.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    Button btnHeartBeat;
    Button btnGPS;
    Button btnPressure;
    Button btnAccelerometer;
    Button btnPhoto;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setUpGUI();
    }

    private void setUpGUI(){
        btnHeartBeat = findViewById(R.id.btnGetHeartBeat);
        btnHeartBeat.setOnClickListener(v-> sendUserToHeartBeatActivity());

        btnGPS = findViewById(R.id.btnGetGPS);
        btnGPS.setOnClickListener(v-> sendUserToGPSActivity());

        btnPressure = findViewById(R.id.btnGetPressure);
        btnPressure.setOnClickListener(v-> sendUserToPressureActivity());

        btnAccelerometer = findViewById(R.id.btnAccelerometer);
        btnAccelerometer.setOnClickListener(v-> sendUserToAccelerometerActivity());

        btnPhoto = findViewById(R.id.btnGetPhoto);
        btnPhoto.setOnClickListener(v-> sendUserToPhotoActivity());
        
    }

    private void sendUserToHeartBeatActivity() {
    }

    private void sendUserToGPSActivity() {
    }

    private void sendUserToPressureActivity() {
    }

    private void sendUserToAccelerometerActivity() {
    }

    private void sendUserToPhotoActivity() {
    }


}