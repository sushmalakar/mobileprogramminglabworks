package edu.divyagyan.customlistview.model;

public class Movie {

    private String title;
    private String genre;
    private String duration;
    private String mDate;

    private int image;

    public Movie(String title, String genre,
                 String duration, String mDate,
                 int image) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.mDate = mDate;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }


    public int getImageResId() {
        return image;
    }

    public void setImageResId(int image) {
        this.image = image;
    }
}
