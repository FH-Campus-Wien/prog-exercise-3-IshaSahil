package at.ac.fhcampuswien;


import java.util.Random;
import java.util.Scanner;





public class App {

    //Implement all methods as public static

    //Task 1: OneMonthCalender

        public static void OneMonthCalender(int numDays,int startDay){
            //rechtsbündig, soutprintf ( %, ... ) oder andere Bedingung

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

        //Task 2: Pseudo Random Numbers
        public static long[] lcg ( long seed){
            int a = 1103515245, c = 12345;
            long m = 2147483648L;
            long[] pseudoRandom = new long[10];

            for (int i = 0; i < 10; i++) {
                seed = (a * seed + c) % m;
                pseudoRandom[i] = seed;
            }

            return pseudoRandom;
        }

        public static int randomnumberBetweenOneAndHundred() {
            Random random = new Random();
            int zufallszahl = random.nextInt(99) + 1;
            return zufallszahl;
        }

        //Task 3: Guessing Game
        public static void guessingGame ( int numberToGuess){
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
                    System.out.println("The number AI picked is " + (input < numberToGuess ? "higher " : "lower ") + "than your guess.");
            }
        }

        public static int randomNumberBetweenOneAndHundred () {
            Random rnd = new Random();
            return rnd.nextInt(100) + 1;
        }


        public static boolean swapArrays ( int[] arrayOne, int[] arrayTwo){
            int temp;
            if (arrayOne.length != arrayTwo.length) {
                return false;
            }
            for (int i = 0; i < arrayOne.length; i++) {
                temp = arrayOne[i];
                arrayOne[i] = arrayTwo[i];
                arrayTwo[i] = temp;

            }
            return true;
        }

        //Task 5 : Camel Case
        public static String camelCase(String sentence)
        {
            char[] cs = sentence.toCharArray();
            boolean big = true;
            boolean small = false;
            StringBuilder resut = new StringBuilder();
            for (int i = 0; i < cs.length; i++)
            {

                if (cs[i] == 32) {
                    big = true;
                    small = false;

                } else if (big && (cs[i] <= 90 && cs[i] >= 65 || cs[i] >= 97 && cs[i] <= 122)) {
                    if (cs[i] >= 97 && cs[i] <= 122) {
                        resut.append((char) (cs[i] - 32));

                    } else {
                        resut.append(cs[i]);
                    }
                    big = false;
                    small = true;

                } else if (small && (cs[i] <= 90 && cs[i] >= 65 || cs[i] >= 97 && cs[i] <= 122)) {
                    if (cs[i] >= 65 && cs[i] <= 90) {
                        resut.append((char) (cs[i] + 32));

                    } else {
                        resut.append(cs[i]);
                    }
                }

            }
            return resut.toString();
        }


        // Task 6: Check Digit
        public static int checkDigit ( int[] inputArray){
            int productsSum = 0;
            int checkDigit;
            for (int i = 0; i < inputArray.length; i++) {
                productsSum += inputArray[i] * (i + 2);
            }
            checkDigit = 11 - (productsSum % 11);
            if (checkDigit == 10) return 0;
            else if (checkDigit == 11) return 5;
            return checkDigit;
        }

    }


























