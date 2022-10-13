package com.example.pbl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cuboidVolume extends AppCompatActivity {

    private EditText inputUserW;
    private EditText inputUserL;
    private EditText inputUserH;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid_volume);

        inputUserW = (EditText) findViewById(R.id.inputWidth);
        inputUserL = (EditText) findViewById(R.id.inputLength);
        inputUserH = (EditText) findViewById(R.id.inputHeight);
        answer =(TextView) findViewById(R.id.answerView);
    }

    public void calculateVolumeCuboid(View view) {
        String widthStr = inputUserW.getText().toString();
        double widthInt = Double.parseDouble(widthStr);

        String lengthStr = inputUserL.getText().toString();
        double lengthInt = Double.parseDouble(lengthStr);

        String heightStr = inputUserH.getText().toString();
        double heightInt = Double.parseDouble(heightStr);

        String answer2= Double.toString(widthInt*lengthInt*heightInt);

        answer.setText(answer2+" cm\u00B3");
    }

    public void backBtn(View view) {
        Intent intentAngle = new Intent(this,volumePoly.class);
        startActivity(intentAngle);
    }
}