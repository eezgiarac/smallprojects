package Part1;

import java.util.Scanner;

public class OddOrEven {

    public static String identify(int number){
        String result="Odd";

        if (number%2==0){
            result="Even";
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        while(true){


            System.out.println("Please enter a number: ");
            int number = input.nextInt();

            if (identify(number).equals("Odd")){
                System.out.println(number + " is odd number.");
            }else {
                System.out.println(number + " is even number.");
            }

            System.out.println("Do you want to continue? ");
            char continueAsk = input.next().charAt(0);

            while (true) {

                if (continueAsk == 'n' || continueAsk == 'N') {
                    System.out.println("Thank you! Game Ended!");
                    System.exit(1);
                } else if (continueAsk == 'y' || continueAsk == 'Y') {
                  break;
                }else if (!(continueAsk == 'y' || continueAsk == 'Y')) {
                    System.err.println("Please enter valid answer!");
                    continueAsk = input.next().charAt(0);
                }
            }

        }


    }

}
