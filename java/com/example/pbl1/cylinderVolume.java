package com.example.pbl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cylinderVolume extends AppCompatActivity {

    private TextView textAnswerView;
    private EditText inputRadiusText;
    private EditText inputHeightText;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_volume);
        textAnswerView = (TextView) findViewById(R.id.answerBox);
        inputHeightText = (EditText) findViewById(R.id.heightInput);
        inputRadiusText = (EditText) findViewById(R.id.radiusInput);

        btnManager();
    }

    public void calculateVolumeCylinder(View view) {

        String heightStr = inputHeightText.getText().toString();
        double heightInt = Double.parseDouble(heightStr);

        String radiusStr = inputRadiusText.getText().toString();
        double radiusInt = Double.parseDouble(radiusStr);

        double volumeCylinder = 3.1416*(Math.pow(radiusInt,2)*heightInt);

        String answer= Double.toString(volumeCylinder);

        textAnswerView.setText(answer+" cm\u00B3");
    }

    public void btnManager(){
        backBtn = (Button) findViewById(R.id.backButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backBtnCyl();
            }
        });
    }

    public void backBtnCyl(){
        Intent intentAngle = new Intent(this,volumePoly.class);
        startActivity(intentAngle);
    }
}