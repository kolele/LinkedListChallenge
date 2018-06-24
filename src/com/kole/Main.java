package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        //ArrayList<Album> albums = new ArrayList<Album>();
        LinkedList<Song> playList = new LinkedList<Song>();
        Album rideTheLightning = new Album("Ride the Lightning");
        rideTheLightning.addSongToAlbum("Whiplash", 12.55);
        rideTheLightning.addSongToAlbum("One", 12.55);
        rideTheLightning.addSongToAlbum("And Justice for All!", 12.55);
        rideTheLightning.addSongToAlbum("Fuel", 12.55);
        rideTheLightning.addSongToAlbum("Some Kind of Monster", 12.55);

        rideTheLightning.addToPlaylist("Fuel", playList);
        rideTheLightning.addToPlaylist("One", playList);
        rideTheLightning.addToPlaylist("Some Kind of Monster", playList);
        rideTheLightning.addToPlaylist("And Justice for All!", playList);

        play(playList);

    }

    public static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Now playing " + listIterator.hasNext());
        }


    }


}
