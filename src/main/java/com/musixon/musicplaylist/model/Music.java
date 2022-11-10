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

        public Music(String song, String singer, String genre, String likes, String imageUrl, String musiccode) {
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

        public String getsong() {
            return song;
        }

        public void setsong(String song) {
            this.song = song;
        }

        public String getsinger() {
            return singer;
        }

        public void setsinger(String singer) {
            this.singer = singer;
        }

        public String getgenre() {
            return genre;
        }

        public void setgenre(String genre) {
            this.genre = genre;
        }

        public String getlikes() {
            return likes;
        }

        public void setlikes(String likes) {
            this.likes = likes;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getmusiccode() {
            return musicCode;
        }

        public void setMusicCode(String musicCode) {
            this.musicCode = musicCode;
        }

        @Override
        public String toString() {
            return "Music{" +
                    "id=" + id +
                    ", song='" + song + '\'' +
                    ", singer='" + singer + '\'' +
                    ", genre='" + genre + '\'' +
                    ", likes='" + likes + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    '}';
        }
    }

