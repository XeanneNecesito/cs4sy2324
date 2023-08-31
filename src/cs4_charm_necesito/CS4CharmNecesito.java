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
        System.out.println(btype) + "1";
        //put new line here
        String rbc = "Red Blood Cells";
        String rbcolor = "Red";
        int rbcount = "5000000";
        System.out.println(name) + System.out.println(rbc);
        System.out.println(color) + System.out.println(rbcolor);
        System.out.println(count) + System.out.println(rbcount);

        //blood type2
        System.out.println(btype) + "2";
        //put new line here
        String wbc = "White Blood Cells";
        String wbcolor = "White";
        int wbcount = "55000;
        System.out.println(name) + System.out.println(wbc);
        System.out.println(color) + System.out.println(wbcolor);
        System.out.println(count) + System.out.println(wbcount);

        //blood type3
        System.out.println(btype) + "3";
        //put new line here
        String plt = "Platelets";
        String pltcolor = "cloudy-yellowish";
        int pltcount = "1500000";
        System.out.println(name) + System.out.println(plt);
        System.out.println(color) + System.out.println(pltcolor);
        System.out.println(count) + System.out.println(pltcount);

        int total = rbcount + wbcount + pltcount;
        System.out.println("Total number of cells in a drop of blood: ") + System.out.println(total);

        if(rbcount > wbcount && rbcount > pltcount){
            System.out.println("Red blood cells is the most abundant blood cells: " + "True")
            }else{
                System.out.println("Red blood cells is the most abundant blood cells: " + "False")
                }

        if(rbcolor == wbcolor && rbcolor == pltcolor && wbcolor == pltcolor){
            System.out.println("These blood cells has the same color: " + "Yes")
            }else{
                System.out.println("These blood cells has the same color: " + "No")
                }

