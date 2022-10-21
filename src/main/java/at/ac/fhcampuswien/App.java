package at.ac.fhcampuswien;

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






