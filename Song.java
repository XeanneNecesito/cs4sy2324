/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_2;

/**
 *
 * @author Xeanne Necesito
 */
public class Song {
    String Title;
    String Singer;
    String Album;

    public void play(){ //for the text now playing
    }
    public void showProperties(){//for the first performance earnings

    }
    public Song(String title){
        Title=title;
    }

    public Song(String singer, String title, String album){
        Title=title;
        Singer=singer;
        Album=album;
        System.out.println("Now playing:" + Title);
        System.out.println("Title:" + Title);
        System.out.println("Singer:" + Singer);
        System.out.println("Album: " + Album);
    }
}
