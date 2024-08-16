package edu.divyagyan.implicitintent;

import static android.content.Intent.*;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button openWebPageButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openWebPageButton = findViewById(R.id.opeWebPageButton);

        openWebPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.google.com");
                Intent intent = new Intent(ACTION_VIEW, webpage);

                startActivity(intent);
            }
        });
    }
}
