package edu.divyagyan.listviewexamples;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomGridViewActivity extends AppCompatActivity {
    protected GridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView = findViewById(R.id.gridview);

    }
}
