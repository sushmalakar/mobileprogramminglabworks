package edu.divyagyan.passingdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText userNameEditText;
    private Button loginButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEditText = findViewById(R.id.userNameEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameEditText.getText().toString().trim();

                if(isValidUserName(userName)){
                    //explicit
//                    //startActivity(new Intent(MainActivity.this, DashboardActivity.class

//                    Intent intent ;
//                    startActivity(new Intent(MainActivity.this,DashboardActivity.class);

                    Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
                    intent.putExtra("username", userName);
                    startActivity(intent);



//                    Intent.putExtra("age", 18);
//                    Intent.putExtra("money", 10.5);



                }else{
                    Toast.makeText(MainActivity.this, "Invalid username", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    boolean isValidUserName(String userName) {
        if (userName.isEmpty()) {
            return false;
        }
        if (userName.length()<3){
            return false;
        }
        return true;
    }
}
