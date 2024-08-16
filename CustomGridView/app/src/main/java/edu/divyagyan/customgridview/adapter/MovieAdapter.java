package edu.divyagyan.customgridview.adapter;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import edu.divyagyan.customgridview.R;
import edu.divyagyan.customgridview.model.Movie;

import java.util.ArrayList;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Activity context;
    private ArrayList<Movie> movies;

    public MovieAdapter(Activity context, ArrayList<Movie> movies) {
        super(context, R.layout.grid_item, movies);
        this.context = context;
        this.movies = movies;
    }


    @NonNull
    @Override
    @SuppressLint("MissingInflatedId")
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = context.getLayoutInflater().inflate(R.layout.grid_item, parent, false);

        ImageView movieImageView = view.findViewById(R.id.gridImageView);
        TextView titleTextView = view.findViewById(R.id.gridTextView);


        Movie movie = movies.get(position);
        titleTextView.setText(movie.getTitle());

        movieImageView.setImageResource(movie.getImageResId());

//        Picasso.get().load(movie.getImageUrl()).into(movieImageView);

        return view;

    }
}
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            LayoutInflater inflater = LayoutInflater.from(context);
//            convertView = inflater.inflate(R.layout.grid_item, parent, false);
//        }
//
//        ImageView imageView = convertView.findViewById(R.id.gridImageView);
//        TextView textView = convertView.findViewById(R.id.gridTextView);
//
//        Movie movie = (Movie) getItem(position);
//
//        imageView.setImageResource(movie.getImageResId());
//        textView.setText(movie.getTitle());
//
//        return convertView;
//    }


