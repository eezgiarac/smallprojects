package Part1;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static double divide(double divided , double divisor){

        double division=0;


        while (divided >= divisor) {
            (divided) -= divisor;
            division++;
        }


        return division;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter two numbers");
        double divided = input.nextInt();
        double divisor = input.nextInt();
        double division=0;


        if (divisor == 0){
            //throw new RuntimeException("Divisor can not be zero!");
            System.err.println("Divisor can not be 0");
            System.exit(1);
        }else if (divided<0 && divisor<0){
            division = divide(divided*-1, divisor*-1);

        } else {
            if (divided < 0) {
                division = divide(divided* -1, divisor);

            }else if (divisor < 0) {
                division = divide(divided, divisor* -1);

            }
            division *=-1;
        }

        if(divided>0 && divisor>0){
            division = divide(divided, divisor);
        }

        System.out.println("Division method result : " + division);



        input.close();


    }
}

/*
 Create a class named DivideTwoNumbers and Write a program
 that can divide two positive numbers without using / (division)
 and * (multiplication) operators.

 */

/*

        if (divisor == 0){
            //throw new RuntimeException("Divisor can not be zero!");
            System.err.println("Divisor can not be 0");
            System.exit(1);
        }else if (divided<0 && divisor<0){
            division = divide(divided*-1, divisor*-1);

        } else {
            if (divided < 0) {
                division = divide(divided* -1, divisor);

            }else if (divisor < 0) {
                division = divide(divided, divisor* -1);

            }
            division *=-1;
        }

        if(divided>0 && divisor>0){
            division = divide(divided, divisor);
        }

        double check = (divided/divisor);
        System.out.println("division : " + (int)division + " , " + "check : " + (int)check);

        if ((int)division == (int)check){

            DecimalFormat formatter = new DecimalFormat("###.###");
            System.out.println("Division is: " + (divided/divisor));
        }



 */

/*
  double check = (divided/divisor);
      //  System.out.println("division : " + (int)division + " , " + "check : " + (int)check);

        if ((int)division == (int)check){
            //DecimalFormat formatter = new DecimalFormat("###.###");
            System.out.println("Division is: " + check);
        }
 */