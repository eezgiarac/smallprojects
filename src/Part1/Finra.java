package Part1;

import java.util.Arrays;
import java.util.Scanner;

public class Finra {

    public static String[] finraMethod(int [] a){


        String[] new_array = new String[a.length];

        for (int i = 0; i < new_array.length; i++) {

            if (a[i]%15==0){
                new_array[i] = "FINRA";
            } else if (a[i]%5==0) {
                new_array[i] = "RA";
            } else if (a[i]%3==0) {
                new_array[i] = "FIN";
            }else {
                new_array[i] = "" + a[i];
            }

        }


        return new_array;
    }

    public static void main(String[] args) {


        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        System.out.println("Old array : " + Arrays.toString(array));

        System.out.println("New array : " + Arrays.toString(finraMethod(array)));

        System.out.println("----------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many number do you want to check");
        int n = input.nextInt();
        System.out.println("Please enter your number list");

        int[] arr = new int[n];
        int number=0;
        while (n>0){
           arr[number]  = input.nextInt();
           number++;
           n--;
        }

        System.out.println("New array : " + Arrays.toString(finraMethod(arr)));
        System.out.println("----------------------------------------------------------------------------");



    }
}
