/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_2;

/**
 *
 * @author Xeanne Necesito
 */
public class Singer {
    String Name;
    int noOfPerformances;
    int earnings;
    Song favoriteSong;
    //String newSong = "fearless";

    public Singer()
    {
        noOfPerformances=0;
        earnings=0;
        favoriteSong = new Song("Default");
    }

    public Singer(String faveSong)
    {
        noOfPerformances=0;
        earnings=0;
        favoriteSong = new Song (faveSong);
    }

    public void performForAudience(int NumberOfPeople)
    {
        earnings = earnings + (100 * NumberOfPeople);
        noOfPerformances+=1;  
    }

    public void changeFavSong(Song newSong){
        favoriteSong = newSong;
    }

    public void showProperties()
    {
        System.out.println("");
        System.out.println("Performances:" + noOfPerformances);
        System.out.println("Earnings:" + earnings);
        System.out.println("Favorite Song:" + favoriteSong.Title);
    }
}
