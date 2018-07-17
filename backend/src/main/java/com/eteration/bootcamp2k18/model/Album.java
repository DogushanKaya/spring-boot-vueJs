package com.eteration.bootcamp2k18.model;

import com.eteration.bootcamp2k18.type.FormatEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ALBUM")
public class Album {

    @Id
    @GeneratedValue
    @Column(name="ALBUM_ID")
    private Long id;

    private String name;
    private String year;
    private FormatEnum format;

    @OneToMany(mappedBy="album")
    private List<Track> trackList = new ArrayList<>();

    @JsonIgnoreProperties(value="albumList")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ARTIST_ID")
    private Artist artist;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }


    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }


}
