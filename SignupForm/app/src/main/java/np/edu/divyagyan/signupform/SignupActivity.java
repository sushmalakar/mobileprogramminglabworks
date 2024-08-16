package np.edu.divyagyan.signupform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/// @author Dinesh Maharjan
/// @email: dinesh.maharjan@fonepay.com
/// @created_at: 28/03/2023


public class SignupActivity extends AppCompatActivity {

    private EditText fullNameEditText, addressEditText, mobileNumberEditText;
    private RadioGroup genderRadioGroup;
    private CheckBox termsCheckBox;
    private Spinner countrySpinner;

    private Button signupButton;

    private String genderValue;

    private String TAG = SignupActivity.class.getCanonicalName();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupform);
        initViews();
        checkBoxListener();
        buttonOnClickListener();
    }

    private void checkBoxListener() {

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                System.out.println("checked id " + checkedId);

                switch (checkedId) {
                    case R.id.maleRadioButton:
                        RadioButton radioButton = findViewById(R.id.maleRadioButton);
                        genderValue = radioButton.getText().toString();

                        break;

                    case R.id.femaleRadioButton:
                        RadioButton femaleRadioButton = findViewById(R.id.femaleRadioButton);
                        genderValue = femaleRadioButton.getText().toString();

                        break;

                    case R.id.otherRadioButton:
                        RadioButton otherRadioButton = findViewById(R.id.otherRadioButton);
                        genderValue = (String) otherRadioButton.getText();
                        break;
                }


            }
        });

    }

    private void initViews() {
        fullNameEditText = findViewById(R.id.fullNameEditText);
        signupButton = findViewById(R.id.singupButton);
        addressEditText = findViewById(R.id.addressEditText);
        mobileNumberEditText = findViewById(R.id.mobileNumberEditText);
        genderRadioGroup = findViewById(R.id.radioButtonGroup);
        countrySpinner = findViewById(R.id.countrySpinner);
        termsCheckBox = findViewById(R.id.termsAndConditionCheckBox);
    }

    private void buttonOnClickListener() {
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = fullNameEditText.getText().toString().trim();
                String address = addressEditText.getText().toString().trim();
                String mobileNumber = mobileNumberEditText.getText().toString().trim();


                Log.i(TAG, fullName);
                Log.i(TAG, address);
                Log.i(TAG, mobileNumber);
                Log.i(TAG, genderValue);


            }
        });
    }
}
