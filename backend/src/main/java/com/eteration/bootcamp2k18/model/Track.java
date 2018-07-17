package com.eteration.bootcamp2k18.model;

import com.eteration.bootcamp2k18.type.GenreEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Track {

    @Id
    @GeneratedValue
    @Column(name="TRACK_ID")
    private Long id;

    private String title;
    private String duration;
    private GenreEnum genre;

    @JsonIgnoreProperties(value="albumList")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ARTIST_ID")
    private Artist artist;

    @JsonIgnoreProperties(value="trackList")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ALBUM_ID")
    private Album album;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
