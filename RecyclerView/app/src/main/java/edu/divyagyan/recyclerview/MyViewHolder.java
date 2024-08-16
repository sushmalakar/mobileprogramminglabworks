package edu.divyagyan.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView nameTextView, emailTextView;

    // Constructor for MyViewHolder
    public MyViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        nameTextView = itemView.findViewById(R.id.nameTextView);
        emailTextView = itemView.findViewById(R.id.emailTextView);
    }
}
