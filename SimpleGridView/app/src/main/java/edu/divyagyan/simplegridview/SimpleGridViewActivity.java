package edu.divyagyan.simplegridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleGridViewActivity extends AppCompatActivity {
    private GridView gridView;
    private ArrayAdapter<String> arrayAdapter;
    private String[] datas = {"Grid 1", "Grid 2",
            "Grid 3", "Grid 4", "Grid 5", "Grid 6", "Grid 7",
            "Grid 8", "Grid 9", "Grid 10"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_gridview);

        gridView = findViewById(R.id.myList);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, datas);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = arrayAdapter.getItem(position);
                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
