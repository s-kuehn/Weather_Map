package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Alabama","Montgomery");
        capitals.put("Alaska","Junea");
        capitals.put("Arizona","Phoenix");
        capitals.put("Arkansas","Little Rock");
        capitals.put("California","Sacramento");
        capitals.put("Colorado","Denver");
        capitals.put("Connecticut","Hartford");
        capitals.put("Delaware","Dover");
        capitals.put("Florida","Tallahassee");
        capitals.put("Georgia","Atlanta");
        capitals.put("Hawaii","Honolulu");
        capitals.put("Idaho","Boise");
        capitals.put("Illinois","Springfield");
        capitals.put("Indiana","Indianapolis");
        capitals.put("Iowa","Des Moines");
        capitals.put("Kansas","Topeka");
        capitals.put("Kentucky","Frankfort");
        capitals.put("Louisiana","Baton Rouge");
        capitals.put("Maine","Augusta");
        capitals.put("Maryland","Annapolis");
        capitals.put("Massachusetts","Boston");
        capitals.put("Michigan","Lansing");
        capitals.put("Minnesota","Saint Paul");
        capitals.put("Mississippi","Jackson");
        capitals.put("Missouri","Jefferson City");
        capitals.put("Montana","Helena");
        capitals.put("Nebraska","Lincoln");
        capitals.put("Nevada","Carson City");
        capitals.put("New Hampshire","Concord");
        capitals.put("New Jersey","Trenton");
        capitals.put("New Mexico","Santa Fe");
        capitals.put("New York","Albany");
        capitals.put("North Carolina","Raleigh");
        capitals.put("North Dakota","Bismarck");
        capitals.put("Ohio","Columbus");
        capitals.put("Oklahoma","Oklahoma City");
        capitals.put("Oregon","Salem");
        capitals.put("Pennsylvania","Harrisburg");
        capitals.put("Rhode Island","Providence");
        capitals.put("South Carolina","Columbia");
        capitals.put("South Dakota","Pierre");
        capitals.put("Tennessee","Nashville");
        capitals.put("Texas","Austin");
        capitals.put("Utah","Salt Lake City");
        capitals.put("Vermont","Montpelier");
        capitals.put("Virgina","Richmond");
        capitals.put("Washington","Olympia");
        capitals.put("West Virginia","Charleston");
        capitals.put("Wisconsin","Madison");
        capitals.put("Wyoming","Cheyenne");

        int score = 0;

        for(String state : capitals.keySet()) {
            System.out.println("What is the capitol of " + state + " ?");
            String answer = input.nextLine();
            if(answer.equals(capitals.get(state))){
                System.out.println("Correct!");
                score += 1;
            }
            else{
                System.out.println("Game Over! Your score is " + score + "!");
                break;
            }
            continue;
        }
        if(score == 60){
            System.out.println("You Win! Your score is " + score + " and you got all 60 states!");
        }

//      Loop through all States
//      Ask user what the capitol is
//      Compare user input to State Value entry (make both lowercase while comparing)
//      If they are the same, add a point to the user's score
//      If they are different, break the loop to end the game
//      If user gets all 50 capitols right (game loop ends), User wins the game.

//      Create a UI for the game above
//      Add a map next to the game that shows the US
//      Add a tally to keep track of how many the user got correct and incorrect
    }
}