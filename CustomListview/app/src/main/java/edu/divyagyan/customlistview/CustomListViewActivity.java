package edu.divyagyan.customlistview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import edu.divyagyan.customlistview.adapter.MovieAdapter;
import edu.divyagyan.customlistview.model.Movie;

public class CustomListViewActivity extends AppCompatActivity {

    private ListView movieListView;
    private MovieAdapter movieAdapter;
    private ArrayList<Movie> movieArrayList;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);
        movieListView = findViewById(R.id.movieListView);

        initMovieList();
        movieAdapter = new MovieAdapter(CustomListViewActivity.this, movieArrayList);
        movieListView.setAdapter(movieAdapter);


        movieListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CustomListViewActivity.this, movieArrayList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initMovieList() {
        movieArrayList = new ArrayList<>();

        Movie movie = new Movie("OpenHiemer", "Drama",
                "2 Hrs", "July 24, 2025", R.drawable.images);
        movieArrayList.add(movie);

        movie = new Movie("OpenHeimer", "Action",
                "1.5 Hrs", "August 24, 2024", R.drawable.images);
        movieArrayList.add(movie);

        movie = new Movie("OpenHiemer", "Drama",
                "2 Hrs", "July 24, 2025", R.drawable.images);
        movieArrayList.add(movie);

        movie = new Movie("OpenHeimer", "Action",
                "1.5 Hrs", "August 24, 2024", R.drawable.images);
        movieArrayList.add(movie);


    }
}
