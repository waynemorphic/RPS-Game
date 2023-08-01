package org.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    // Method that evaluates the user input
    public static void game() throws IOException{
        Set<String> set = new HashSet<>();
        set.add("rock");
        set.add("paper");
        set.add("scissors");

        // Player A input
        System.out.println("Enter either Rock, Paper or Scissors");
        System.out.println("Player A choice: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String choiceA = bufferedReader.readLine();

        // Player B input
        System.out.println("Player B choice: ");
        String choiceB = bufferedReader.readLine();

        // Evaluate the input
        if(set.contains(choiceA.toLowerCase()) && set.contains(choiceB.toLowerCase())){

            // Execute the choices method and print output
            System.out.println("Result -----> " + Main.choices(choiceA, choiceB));
        }
        // Exception/Wrong input & Exit game
        else {
            System.out.println("Please enter either Rock, Paper or Scissors");
            System.out.println("Continue? Y/N");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
            String cont = bufferedReader2.readLine();

            if (cont.equalsIgnoreCase("y")){
                Main.game();
            }
            else{
                throw new IOException("Wrong input! Game terminated");
            }
        }
    }

    // Method to evaluate game choices entered
    public static String choices(String choiceA, String choiceB){
        final String a = choiceA.toLowerCase();
        final String b = choiceB.toLowerCase();
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";
        String playerA = "Player A wins";
        String playerB = "Player B wins";

        if (!a.equals(b)){
            // Rock
            if (a.equals(rock) && b.equals(scissors)){
                return playerA;
            }
            if (a.equals(scissors) && b.equals(rock)){
                return playerB;
            }

            // Paper
            if (a.equals(paper) && b.equals(rock)){
                return playerA;
            }
            if (a.equals(rock) && b.equals(paper)){
                return playerB;
            }

            // Scissors
            if (a.equals(scissors) && b.equals(paper)){
                return playerA;
            }
            if (a.equals(paper) && b.equals(scissors)){
                return playerB;
            }
        }
        // Tie
        return "It is a Tie";
    }

    public static void main(String[] args){

        // Handle IOException thrown in game method
        try {
            Main.game();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
