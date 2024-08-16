package edu.divyagyan.customgridview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import edu.divyagyan.customgridview.adapter.MovieAdapter;
import edu.divyagyan.customgridview.model.Movie;

public class CustomGridViewActivity extends AppCompatActivity {

    private GridView movieListView;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> movieArrayList;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_gridview);
        movieListView = findViewById(R.id.gridView);

        initMovieList();
        movieAdapter = new MovieAdapter(CustomGridViewActivity.this, movieArrayList);
        movieListView.setAdapter(movieAdapter);


        movieListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomGridViewActivity.this, movieArrayList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initMovieList() {
        movieArrayList = new ArrayList<>();

        Movie movie = new Movie("OpenHiemer", R.drawable.images);
        movieArrayList.add(movie);

        movie = new Movie("OpenHiemer", R.drawable.images);
        movieArrayList.add(movie);

        movie = new Movie("OpenHiemer", R.drawable.images);
        movieArrayList.add(movie);


        movie = new Movie("OpenHiemer", R.drawable.images);
        movieArrayList.add(movie);
        movie = new Movie("OpenHiemer", R.drawable.images);
        movieArrayList.add(movie);



    }
}
