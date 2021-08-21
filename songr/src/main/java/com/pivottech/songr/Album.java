package com.pivottech.songr;

public class Album {
    private String title;
    private String artist;
    private String imageUrl;
    private int songCount;
    private int length;

    Album(String title, String artist, String imageUrl, int songCount, int length)
    {
        this.title = title;
        this.artist = artist;
        this.imageUrl = imageUrl;
        this.songCount = songCount;
        this.length = length;
    }

    public String getTitle() { return title; }

    public String getArtist() { return artist; }

    public String getSongCount(){ return imageUrl; }

    public String getLength(){ return imageUrl; }

    public String getImageUrl(){ return imageUrl; }

}
