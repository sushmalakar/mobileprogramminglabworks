package edu.divyagyan.listviewexamples;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button simpleListViewButton;
    private Button simpleGridViewButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      simpleListViewButton = findViewById(R.id.simpleListViewButton);
      simpleGridViewButton = findViewById(R.id.simpleGridViewButton);


      simpleListViewButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, SimpleListViewActivity.class));
          }
      });

      simpleGridViewButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(MainActivity.this, SimpleGridViewExample.class));
          }
      });

    }
}
