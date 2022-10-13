package com.example.pbl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class anglePoly extends AppCompatActivity {

    private EditText sidesPoly;
    private TextView interiorAnswer;
    private TextView exteriorAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);

        sidesPoly = (EditText) findViewById(R.id.inputSides);
        interiorAnswer = (TextView) findViewById(R.id.iAngleAnswer);
        exteriorAnswer = (TextView) findViewById(R.id.eAngleAnswer);

    }

    public void angleCalc(View view) {
        String sidesP = sidesPoly.getText().toString();
        double sidesPol = Double.parseDouble(sidesP);

        String answer1 = Double.toString(360/sidesPol);
        String answer2 = Double.toString((sidesPol-2)*(180/sidesPol));

        interiorAnswer.setText(answer2+" \u00B0");
        exteriorAnswer.setText(answer1+" \u00B0");
    }

    public void backBtnAngle(View view) {
        Intent intentAngle = new Intent(this,MainActivity.class);
        startActivity(intentAngle);
    }
}