package com.designpatterns.Factory;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGamePlay {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        while (true){
            System.out.println("Choose your gesture (rock, paper, scissors) or type 'exit' to quit :");
            String input = scanner.nextLine().toUpperCase();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("Thanks for playing!");
                break;
            }

            RockPaperScissorGesture playerGesture= RockPaperScissorGesture.valueOf(input);
            RockPaperScissorGesture computerGesture= generateRandomGesture();
            System.out.println("Computer chose : "+ computerGesture);
            determineWinner(playerGesture,computerGesture);



        }
    }

    private static RockPaperScissorGesture generateRandomGesture(){
        Random random = new Random();
        return  RockPaperScissorGesture.values()[random.nextInt(RockPaperScissorGesture.values().length)];
    }

    public static void determineWinner(RockPaperScissorGesture playerGesture, RockPaperScissorGesture computerGesture){

        if(playerGesture.winsForm().contains(computerGesture)){
            System.out.println("You Win ! ");
        }

        else if (playerGesture.loseTo().contains(computerGesture)){
            System.out.println("You Lose !");
        }
        else {
            System.out.println("It is a tie !");
        }
    }

}
