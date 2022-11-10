package com.musixon.musicplaylist.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Music implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String song;
    private String singer;
    private String genre;
    private String likes;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String musicCode;

    public Music() {}
    public Music(Long id, String song, String singer, String genre, String likes, String imageUrl, String musicCode) {
        this.id = id;
        this.song = song;
        this.singer = singer;
        this.genre = genre;
        this.likes = likes;
        this.imageUrl = imageUrl;
        this.musicCode = musicCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMusicCode() {
        return musicCode;
    }



    public void setMusicCode(String musicCode) {
        this.musicCode = musicCode;
    }
}
