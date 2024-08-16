package edu.divyagyan.simpleinterestcalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainSimpleInterest extends AppCompatActivity {
    private EditText principalEditText;
    private EditText timeEditText;
    private EditText rateEditText;
    private Button calculateButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleinterest_main);

        principalEditText = findViewById(R.id.principalEditText);
        timeEditText = findViewById(R.id.timeEditText);
        rateEditText = findViewById(R.id.rateEditText);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int principal = Integer.parseInt(principalEditText.getText().toString());;
                int time = Integer.parseInt(timeEditText.getText().toString());
                int rate = Integer.parseInt(rateEditText.getText().toString());

                int simpleInterest = (principal*time*rate)/100;

                resultTextView.setText("Result: Rs "+simpleInterest);



            }
        });
    }

}
