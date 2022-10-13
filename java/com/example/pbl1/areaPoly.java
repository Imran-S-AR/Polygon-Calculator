package com.example.pbl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class areaPoly extends AppCompatActivity {

    private EditText apothemInput;
    private EditText perimeterInput;
    private TextView answerArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_poly);

        apothemInput = (EditText) findViewById(R.id.apothemInput);
        perimeterInput = (EditText) findViewById(R.id.perimeterInput);
        answerArea = (TextView) findViewById(R.id.answerInputArea);
    }

    public void submitBtnArea(View view) {
        String apothemStr = apothemInput.getText().toString();
        double apothemInt = Double.parseDouble(apothemStr);

        String perimeterStr = perimeterInput.getText().toString();
        double perimeterInt = Double.parseDouble(perimeterStr);

        String answer2= Double.toString(perimeterInt*(apothemInt/2));

        answerArea.setText(answer2+" cm\u00B2");
    }

    public void backBtnArea(View view) {
        Intent intentAngle = new Intent(this,MainActivity.class);
        startActivity(intentAngle);
    }
}