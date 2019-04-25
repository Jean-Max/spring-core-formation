package com.viseo.training;

public class MediaFile {

    private long id;
    private String title;
    private String artist;
    private String album;
    private Integer duration;


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MediaFile{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public static MediaFile create(String title, String artist, String album, int duration) {
        MediaFile mediaFile = new MediaFile();
        mediaFile.setTitle(title);
        mediaFile.setArtist(artist);
        mediaFile.setAlbum(album);
        mediaFile.setDuration(duration);
        return mediaFile;
    }
}
