package edu.divyagyan.creatingfragmentclass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    private EditText firstNameEditText, secondNameEditText;
    private Button submitButton;
    private TextView resultTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firstNameEditText = view.findViewById(R.id.firstNumberEditText);
        secondNameEditText = view.findViewById(R.id.secondNumberEditText);
        submitButton = view.findViewById(R.id.submitButton);
        resultTextView = view.findViewById(R.id.resultTextView);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstNameEditText.getText().toString().trim());
                int secondNumber = Integer.parseInt(secondNameEditText.getText().toString().trim());

                int result = calculate(firstNumber,secondNumber);
                resultTextView.setText("Result:" +result);

            }
        });
    }
    private int calculate(int firstNum, int secondNum){
        return (firstNum + secondNum);
    }
}
