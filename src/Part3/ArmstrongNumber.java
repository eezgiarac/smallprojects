package Part3;

import java.util.ArrayList;

public class ArmstrongNumber {//We need to check each number to see if they are equal or not  their position
    public static void armstrongNumber(int num){
        int compare=0;
        String[] s = (String.valueOf(num)).split("");
        ArrayList<Integer> nums = new ArrayList<>();

        for (String each : s) {
            nums.add(Integer.parseInt(each));
        }
        for (Integer each : nums) {
            compare += Math.pow(each,nums.size());
        }
        if (compare==num){
            System.out.println("Armstrong number!");
        }else {
            System.out.println("NOPE!");
        }
    }
    public static void main(String[] args) {
        int num = 153;  //armstrong numbers : 125, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050
        armstrongNumber(num);

    }
}
