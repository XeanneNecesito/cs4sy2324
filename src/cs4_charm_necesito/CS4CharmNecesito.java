/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_charm_necesito;

/**
 *
 * @author CHARM
 */
public class CS4CharmNecesito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String btype = "Blood type";
        String name = "Name: ";
        String color = "Color: ";
        String count = "Cell count in a drop of blood: ";

        //blood type1
        System.out.println(btype + "1");
        String rbc = "Red Blood Cells";
        String rbcolor = "Red";
        int rbcount = 5000000;
        System.out.println(name + rbc);
        System.out.println(color + rbcolor);
        System.out.println(count + rbcount);
        
         System.out.println();

        //blood type2
        System.out.println(btype + "2");
        String wbc = "White Blood Cells";
        String wbcolor = "White";
        int wbcount = 55000;
        System.out.println(name + wbc);
        System.out.println(color + wbcolor);
        System.out.println(count + wbcount);
        
        System.out.println();

        //blood type3
        System.out.println(btype + "3");
        String plt = "Platelets";
        String pltcolor = "cloudy-yellowish";
        int pltcount = 1500000;
        System.out.println(name + plt);
        System.out.println(color + pltcolor);
        System.out.println(count + pltcount);
        
        System.out.println();

        int total = rbcount + wbcount + pltcount;
        System.out.println("Total number of cells in a drop of blood: " + total);

        if(rbcount > wbcount && rbcount > pltcount){
            System.out.println("Red blood cells is the most abundant blood cells: " + "True");
            }else{
                System.out.println("Red blood cells is the most abundant blood cells: " + "False");
                }

        if(rbcolor == wbcolor && rbcolor == pltcolor && wbcolor == pltcolor){
            System.out.println("These blood cells has the same color: " + "Yes");
            }else{
                System.out.println("These blood cells has the same color: " + "No");
                }
    }
