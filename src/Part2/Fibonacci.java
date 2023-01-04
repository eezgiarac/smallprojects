package Part2;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static ArrayList<Integer> fibonacci(int limit){

        ArrayList<Integer> result = new ArrayList<>();
        if (limit==1){
            result.add(1);
        } else if (limit==2) {
            result.addAll(Arrays.asList(1,1));
        }else {
            result.addAll(Arrays.asList(1,1));
            for (int i = 0; i < limit; i++) {
                if (result.size()<limit){
                    result.add(result.get(result.size()-1)+result.get(result.size()-2));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        result = fibonacci(6);
        System.out.println(result);



    }

}
