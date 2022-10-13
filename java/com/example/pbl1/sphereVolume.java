package com.example.pbl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class sphereVolume extends AppCompatActivity {

    TextView textAnswerView;
    EditText inputRadiusText;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_volume);

        textAnswerView = (TextView) findViewById(R.id.answerSphereTextText);
        inputRadiusText = (EditText) findViewById(R.id.radiusInputSphere);

        btnManager();
    }

    public void calculateVolumeSphere(View view) {

        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);

        String radiusStr = inputRadiusText.getText().toString();
        double radiusInt = Double.parseDouble(radiusStr);

        double volumeSphere = 1.3333*3.1416*Math.pow(radiusInt,3);
        String volumeSphere2 = df.format(volumeSphere);

        textAnswerView.setText(volumeSphere2+" cm\u00B3");
    }

    public void btnManager(){
        backBtn = (Button) findViewById(R.id.backBtnSphere);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backBtnSph();
            }
        });
    }

    public void backBtnSph(){
        Intent intentAngle = new Intent(this,volumePoly.class);
        startActivity(intentAngle);
    }
}