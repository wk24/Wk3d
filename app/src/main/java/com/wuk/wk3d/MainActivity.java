package com.wuk.wk3d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivBackground = findViewById(R.id.iv_background);
        ImageView ivMid = findViewById(R.id.iv_mid);
        ImageView ivForeground = findViewById(R.id.iv_foreground);
        SensorLayout sensorLayout = findViewById(R.id.sensor_layout);

        ivBackground.setBackground(getResources().getDrawable(R.drawable.background3));
        ivMid.setBackground(getResources().getDrawable(R.drawable.mid3));
        ivForeground.setBackground(getResources().getDrawable(R.drawable.foreground3));


        sensorLayout.setDegreeXMax(25);
        sensorLayout.setDegreeXMin(-25);
        sensorLayout.setDegreeYMax(25);
        sensorLayout.setDegreeYMin(-25);

    }
}