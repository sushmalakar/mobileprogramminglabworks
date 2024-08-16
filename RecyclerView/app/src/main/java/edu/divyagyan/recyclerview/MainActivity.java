package edu.divyagyan.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Sushmita", "sushmita@gmail.com", R.drawable.user_icon));
        items.add(new Item("Ram", "ram@gmail.com", R.drawable.user_icon));
        items.add(new Item("Hari", "hari@gmail.com", R.drawable.user_icon));
        items.add(new Item("Gita", "gita@gmail.com", R.drawable.user_icon));
        items.add(new Item("Sita", "sita@gmail.com", R.drawable.user_icon));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}
