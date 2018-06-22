package com.kole;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSongToAlbum(String name, double duration){
        if (isSongOnFile(name)){
            System.out.println("Song already on file hence cannot add it");
        } else {
            System.out.println("Added song " + name + " to album");
            this.songs.add(new Song(name,duration));
        }
    }

    private Song returnSong(){
        for (Song tempSong: this.songs){
            if (tempSong.getName().equals(name)){
                return tempSong;
            }
        }return null;
    }

    private boolean isSongOnFile(String name){
        for (Song tempSong: this.songs){
            if (tempSong.getName().equals(name)){
                return true;
            }
        }return false;
    }
}
