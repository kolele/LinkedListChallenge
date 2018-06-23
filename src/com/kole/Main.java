package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();
        LinkedList<Song> playList = new LinkedList<Song>();
        Album rideTheLightning = new Album("Ride the Lightning");
        rideTheLightning.addSongToAlbum("Whiplash", 12.55);
        rideTheLightning.addToPlaylist("Whiplash", playList);

    }


}
