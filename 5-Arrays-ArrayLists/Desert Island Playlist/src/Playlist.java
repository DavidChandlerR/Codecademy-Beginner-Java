/*
We’ve provided you with a file Playlist.java.

    Since you’re working with ArrayLists, import ArrayList from java.util.
    Create a Playlist class with a main() method.
 */

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        // create a new ArrayList called desertIslandPlaylist that can hold String values.
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        //Use add() to add several (more than five) of your favorite songs to desertIslandPlaylist
        desertIslandPlaylist.add("Song 1");
        desertIslandPlaylist.add("Song 2");
        desertIslandPlaylist.add("Song 3");
        desertIslandPlaylist.add("Song 4");
        desertIslandPlaylist.add("Song 5");
        desertIslandPlaylist.add("Song 6");
        desertIslandPlaylist.add("Song 7");

        //Check out your personally curated selection of music by printing desertIslandPlaylist to the terminal. Then run your code.
        System.out.println(desertIslandPlaylist.toString());

        //First, check the number of songs on your playlist using size(). Print the number to the terminal.
        System.out.println(desertIslandPlaylist.size());

        //Remove songs from your playlist using remove() until you only have five songs left.
        desertIslandPlaylist.remove("Song 7");
        System.out.println(desertIslandPlaylist.toString());
        desertIslandPlaylist.remove("Song 6");
        desertIslandPlaylist.remove("Song 5");
        System.out.println(desertIslandPlaylist.size());

        //Use indexOf() to get the indices of the two songs you want to swap in desertIslandPlaylist.
        int indexA = desertIslandPlaylist.indexOf("Song 4")
        int indexB = desertIslandPlaylist.indexOf("Song 5")
        String tempA = "Song 4";
        desertIslandPlaylist.set(indexA, "Song 5");
        desertIslandPlaylist.set(indexB, tempA);

        System.out.println(desertIslandPlaylist.toString);
    }

}