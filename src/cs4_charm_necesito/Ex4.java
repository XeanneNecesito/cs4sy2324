/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

import java.util.Scanner;

/**
 *
 * @author Xeanne Necesito
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String player = "";
        String comp = "";
        int play_score = 0;
        int comp_score = 0;
        Move player_move = new Move();
        Move comp_move = new Move();
        Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
        String option = "";
        int roundsToWin = 2;
        while(!option.equals("3"))
        {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            System.out.println("");


            System.out.print("Pick your option: ");
            option = scan.next();
            System.out.println("");

            if(option.equals("1")){
                while(! (play_score>=roundsToWin || comp_score >= roundsToWin)){
                    System.out.println("This match will be first to " + roundsToWin + " wins");
                    System.out.println("The computer has selected its move. Select your move:");
                    System.out.println("1. Rock");
                    System.out.println("2. Paper");
                    System.out.println("3. Scissors");

                    System.out.println("");
                    System.out.print("Select your move: ");
                    String input = scan.next();

                    if(input.equals("1")){
                        player = "rock";
                        player_move = rock;
                    }
                    if(input.equals("2")){
                        player = "paper";
                        player_move = paper;
                    }
                    if(input.equals("3")){
                        player = "scissors";
                        player_move = scissors;
                    }

                    int random = (int) Math.floor(Math.random()*3) + 1;

                     if(random==1){
                        comp = "rock";
                        comp_move = rock;
                    }
                    if(random==2){
                        comp = "paper";
                        comp_move = paper;
                    }
                    if(random==3){
                        comp = "scissors";
                        comp_move = scissors;
                    }

                    System.out.println("Player move:" + player_move.getName());
                    System.out.println("Computer move:" + comp_move.getName());

                    int result = player_move.compareMoves(player_move, comp_move);

                    if(result == 0){
                        play_score = play_score + 1;
                        System.out.println("You won this round.");
                    }else if(result == 1){
                        comp_score = comp_score + 1;
                        System.out.println("You lost this round");
                    }else if(result == 2){
                        System.out.println("This round is tie");
                    }
                    System.out.println("");
                    System.out.println("Player's score: " + play_score);
                    System.out.println("Computer's score: " + comp_score);
                    System.out.println("");

                }if(play_score == roundsToWin){
                    System.out.println("Final Result: " + "You won this game" );
                    System.out.println("");
                }else{
                    System.out.println("Final Result: " + "The computer won this game" );
                    System.out.println("");}
            }else if(option.equals("2")){
                    System.out.print("How many rounds do you want to play: ");
                    String roundToWin = scan.next();
                    roundsToWin = Integer.parseInt(roundToWin);
                    System.out.println("New setting has been saved");
                    System.out.println("");
            }
        } {System.out.println("Thank you for playing!");}
    }
    private static class Move {
        private final String name;
	private Move strongAgainst;

        public Move()
        {
            name = "";
        }
        public Move(String name) {
            this.name = name;
        this.strongAgainst = null;
    }
	public String getName(){
		return this.name;
	}
	public Move getStrongAgainst(){
		return this.strongAgainst;
	}
	public void setStrongAgainst(Move strongAgainst){
		this.strongAgainst = strongAgainst;
	}
    public static int compareMoves(Move m1, Move m2){
		// This method returns 0 if m1 wins, 1 if m2 wins, and 2 if neither wins
		if(m1.getStrongAgainst() ==  m2) return 0;
		else if (m2.getStrongAgainst() == m1) return 1;
		else return 2;
	}

        }
    }


