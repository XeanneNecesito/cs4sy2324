/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_2;

/**
 *
 * @author Xeanne Necesito
 */
public class Main {
    private static Song newSong;
    String Name;
    public void printName(){
        System.out.println(Name);
    }
    public Main(String name){
        Name=name;
    }
    public static void main(String[] args) {
        
        Main exe2ins1 = new Main("K");
        Main exe2ins2 = new Main("T");
        
        
        Song era1 = new Song("Taylor Swift","King of My Heart","Reputation");
        //era1.play();
        //era1.showProperties();
        Song era2 = new Song("Taylor Swift","Daylight","Lover");
        //era1.play();
        //era1.showProperties();
        
        Singer singer1 = new Singer("Fearless");
       
        singer1.performForAudience(12);
        singer1.showProperties();
        singer1.changeFavSong(era1);
        
        //System.out.println("");

        singer1.performForAudience(12);
        singer1.showProperties();
        singer1.changeFavSong(era2);

        singer1.showProperties();
    }          
    
    }
    

