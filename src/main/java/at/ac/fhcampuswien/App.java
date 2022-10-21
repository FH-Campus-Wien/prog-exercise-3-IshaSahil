package at.ac.fhcampuswien;

import jdk.internal.org.jline.utils.ShutdownHooks;
import sun.security.mscapi.CPublicKey;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    //Implement all methods as public static

    public static void main(String[] args) {
        //test your method implementation here
        //make method calls
        //print their results
        //etc.

        public static void oneMonthCalender(int numDays,int startDay){
            //if bedingung mit modulo
            //rechtsbündig,soutprintf ( %, ... ) oder andere Bedingung

            int row;
            int count = 1;
            int column = startDay;


            if ((numDays + startDay) % 7 != 0) {
                row = (numDays / 7) + 1;

            } else {
                row = numDays / 7;
            }
            for (int i = 1; i < startDay; i++) {
                System.out.print("  ");
            }

            for (int j = 0; j < row; j++) {
                while (column <= 7) {
                    System.out.printf("%2d ", count);
                    if (count == numDays) {
                        System.out.println();
                        return;
                    }
                    column++;
                    count++;
                }
                column = 1;
                System.out.println();
            }
        }


    public static long[] lcg(long seed){
            int a = 1103515245, c = 12345;
            long m = 2147483648L;
            long[] pseudoRandom = new long[10];

            for (int i = 0; i < 10; i++) {
                seed = (a * seed + c) % m;
                pseudoRandom[i] = seed;
            }

            return pseudoRandom;
        }

        //Task 3: Guessing Game
        public static void guessingGame(int numberToGuess) {
            Scanner scanner = new Scanner(System.in);
            int input;
            for (int i = 1; i <= 10; i++) {
                System.out.printf("Guess number %s: ", i);
                input = scanner.nextInt();

                if (input == numberToGuess) {
                    System.out.println("You won weisenheimer!");
                    break;
                }
                if (i == 10) System.out.println("You lost! Have you ever heard of divide & conquer");
                else
                    System.out.println("The number AI picked is " + (input < numberToGuess ? "higher " : "lower ") + "than your guess." );
            }
        }











