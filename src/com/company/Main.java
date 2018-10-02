package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Loop Completion Activity
        Scanner kbd = new Scanner(System.in);

        ////////////////////My method WRONG////////////////
//        int num, total = 0;
//
//        for (num = 0; num <=2; num++) {
//            System.out.println("Enter any 10 integers");
//            num = kbd.nextInt();
//            total += num;
//        }
//
//        System.out.println("The total of all " + num  + " numbers is " + total);
        //////////////////////WRONG/////////////////////////////
//************************************************************************************

        //Correct method
//        int num , i, total = 0;
//
//        // Loop should start here
//        int i;
//        for ( i = 0; i <10 ; i++) {
//            System.out.println("Enter a number: ");
//            num = kbd.nextInt();
//            total += num;
//        }
//
//        // Loop should end here
//
//        System.out.println("The total of all " + i + " numbers is " + total);


        //Do while loop
//        int num , i=0, total = 0;
//        do {
//            System.out.println("Enter any number");
//            num=kbd.nextInt();
//            total += num;
//            i++;
//        } while (i<10);
//        System.out.println("The total of all " + i + "numbers is " + total);

        int num = 0, i = 0, total = 0;
        System.out.println("Enter a number");
        while (num <= 10) {
            num = kbd.nextInt();
            i++;
            total += num;

            System.out.println("The total of all " + i + " number is " + total);
        }
    }
}