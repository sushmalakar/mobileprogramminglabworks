package edu.divyagyan.customlistview.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import edu.divyagyan.customlistview.R;
import edu.divyagyan.customlistview.model.Movie;

public class MovieAdapter extends ArrayAdapter<Movie> {
    private Activity context;
    private ArrayList<Movie> movies;


    public MovieAdapter(Activity context, ArrayList<Movie> movies) {
        super(context, R.layout.custom_list_item, movies);
        this.context = context;
        this.movies = movies;
    }


    @NonNull
    @Override
    @SuppressLint("MissingInflatedId")
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = context.getLayoutInflater().inflate(R.layout.custom_list_item, parent,
                false);

        ImageView movieImageView = view.findViewById(R.id.movieImageView);
        TextView titleTextView = view.findViewById(R.id.movieTitle);
        TextView durationTextView = view.findViewById(R.id.durationTextView);
        TextView genreTextView = view.findViewById(R.id.genreTextView);
        TextView dateTextView = view.findViewById(R.id.movieDateTextView);

        Movie movie = movies.get(position);
        titleTextView.setText(movie.getTitle());
        durationTextView.setText(movie.getDuration());
        genreTextView.setText(movie.getGenre());
        dateTextView.setText(movie.getmDate());
        movieImageView.setImageResource(movie.getImageResId());

//        Picasso.get().load(movie.getImageUrl()).into(movieImageView);

        return view;

    }
}
