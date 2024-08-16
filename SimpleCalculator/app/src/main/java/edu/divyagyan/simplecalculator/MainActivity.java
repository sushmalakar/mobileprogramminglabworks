package edu.divyagyan.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private Button addButton;
    private Button subtractionButton;
    private Button multiplicationButton;
    private Button divisionButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        addButton = findViewById(R.id.addButton);
        subtractionButton = findViewById(R.id.subtractionButton);
        multiplicationButton = findViewById(R.id.multiplicationButton);
        divisionButton = findViewById(R.id.divisionButton);
        resultTextView = findViewById(R.id.resultTextView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());

                int result = firstNumber + secondNumber;
                resultTextView.setText("Result: " + result);

            }
        });

        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());

                int result = firstNumber - secondNumber;
                resultTextView.setText("Result: " + result);
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());

                int result = firstNumber * secondNumber;
                resultTextView.setText("Result: "+ result);
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());

                int result = firstNumber / secondNumber;
                resultTextView.setText("Result: " + result);
            }
        });
        
    }
}
