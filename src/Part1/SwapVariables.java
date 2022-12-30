package Part1;

import java.util.Scanner;

public class SwapVariables {
    public static void swap2Var(int x, int y){
        x=(x*y) / (y=(x*y)/y);
        System.out.println("x : " + x + ", y : " + y);
    }

    public static void swap2Var2(int x, int y){
        x = x*y; // x = 10 * 15 , x = 150
        y = x/y; // y = 150/15  , y = 10
        x = x/y; // x = 150/10  , y = 15

        System.out.println("x : " + x + " , y : " + y);
    }
    public static void main(String[] args) {

        int x = 10,
            y = 15;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers : ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("x : " + n1 + ", y : " + n2);

        swap2Var(n1,n2);
        swap2Var2(n1,n2);

    }
}
