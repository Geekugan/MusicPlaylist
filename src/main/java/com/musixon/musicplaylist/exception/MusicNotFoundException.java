package com.musixon.musicplaylist.exception;

public class MusicNotFoundException extends RuntimeException {
    public MusicNotFoundException(String message) {
        super(message);
    }
}
