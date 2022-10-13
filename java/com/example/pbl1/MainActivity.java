package com.example.pbl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button angleBtn;
    private Button areaBtn;
    private Button volumeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnManager();
    }


    //this is where all the button functions is stored
    public void btnManager(){
        angleBtn = (Button) findViewById(R.id.angleBtn);
        angleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anglePolygon();
            }
        });

        areaBtn = (Button) findViewById(R.id.areaBtn);
        areaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                areaPolygon();
            }
        });

        volumeBtn = (Button) findViewById(R.id.volumeBtn);
        volumeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volumePolygon();
            }
        });
    }


    //
    public void anglePolygon(){
        Intent intentAngle = new Intent(this,anglePoly.class);
        startActivity(intentAngle);
    }

    public void areaPolygon(){
        Intent intentArea = new Intent(this,areaPoly.class);
        startActivity((intentArea));
    }

    public void volumePolygon(){
        Intent intentVolume = new Intent(this,volumePoly.class);
        startActivity((intentVolume));
    }
}