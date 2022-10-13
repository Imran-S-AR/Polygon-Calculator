package com.example.pbl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class volumePoly extends AppCompatActivity {

    private Button cylinderBtn;
    private Button sphereBtn;
    private Button cuboidBtn;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_poly);

        btnManager();
    }

    //this is where all the button functions is stored
    public void btnManager(){
        cylinderBtn = (Button) findViewById(R.id.cylinderBtn);
        cylinderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cylinderPage();
            }
        });

        sphereBtn = (Button) findViewById(R.id.sphereBtn);
        sphereBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spherePage();
            }
        });

        cuboidBtn = (Button) findViewById(R.id.cuboidBtn);
        cuboidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuboidPolygon();
            }
        });

        backBtn = (Button) findViewById(R.id.backBtnVolume);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backBtn();
            }
        });

    }


    //
    public void cylinderPage(){
        Intent intentAngle = new Intent(this,cylinderVolume.class);
        startActivity(intentAngle);
    }

    public void spherePage(){
        Intent intentArea = new Intent(this,sphereVolume.class);
        startActivity((intentArea));
    }

    public void cuboidPolygon(){
        Intent intentVolume = new Intent(this,cuboidVolume.class);
        startActivity((intentVolume));
    }

    public void backBtn(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity((intent));
    }
}