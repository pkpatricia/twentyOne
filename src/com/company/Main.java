package com.company;

import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static int firstComputer;
    public static int secondComputer;
    public static int firstUser;
    public static int secondUser;
    public static int computerTotal;
    public static int userTotal;
    public static String winner;

    public static void main(String[] args) throws IOException {
       firstComputer = getComputerAnswer();
       secondComputer = getComputerAnswer();
       firstUser = getUserAnswer();
       secondUser = getUserAnswer();
       computerTotal = firstComputer + secondComputer;
       userTotal = firstUser + secondUser;
       //checkComputerTotal();
       //checkUserTotal();
       winner = compareTotals();
       userTotal = firstUser + secondUser;
       System.out.println("The First User Choice is: " + firstUser);
       System.out.println("The Second User Choice is: " + secondUser);
       System.out.println("The User Total Is: " + userTotal);
       System.out.println("The Systems Total Is: " + computerTotal);
    }


    public static int getComputerAnswer() {
        Random rand = new Random();
        int Choice = rand.nextInt(8) + 2;
        System.out.println("Computer Choice is " + Choice);
        return Choice;
    }

    public static int getUserAnswer() {
        Random rand = new Random();
        int Choice = rand.nextInt(8) + 2;
        System.out.println("User Choice is " + Choice);
        return Choice;
    }

    /*public static int checkComputerTotal() {
        if (computerTotal < 21) {
            firstComputer = getComputerAnswer();
            secondComputer = getComputerAnswer();
            computerTotal = firstComputer + secondComputer;

        }

            System.out.println("Computer Total is: " + computerTotal);

        return computerTotal;

    }
*/

   /* public static int checkUserTotal() {
        if (userTotal < 21) {
            firstUser = getUserAnswer();
            secondUser = getUserAnswer();
        }
        System.out.println("User total is: " + userTotal);

        return userTotal;


    }*/


    public static String compareTotals()  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Do You Want To Draw Again?");

        str = br.readLine();

        if (!str.equals("No")) {

            if (firstUser > secondUser) {

                secondUser = getUserAnswer();


            }

            else if (firstUser < secondUser) {

                firstUser = getUserAnswer();
            }
        }


        if ((userTotal > computerTotal) && (userTotal <= 21)) {
            winner = "User";
            System.out.println("The User is the Winner!");
        }

        else {

            winner = "System";
            System.out.println("The System is the Winner!");

        }


        return winner;

        }




    }



