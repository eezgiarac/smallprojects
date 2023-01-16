package Part3;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int num){
        String result ="";
        if (num<0){
            String s = String.valueOf(num*-1);
            for (int i = s.length()-1; i >=0 ; i--) {
                result+=s.charAt(i);
            }
            num = Integer.parseInt(result)*-1;
        }
        return num;
    }
    public static void main(String[] args) {
        int num = -1234;
        int newNum = reverseNegativeNumber(num);
        System.out.println(newNum);
    }
}
