package Part2;

public class DigitsInNumber {

    public static void digitsInNumber(int num){
        String s = String.valueOf(num);
        System.out.println("Digits in number : " + s.length());
    }
    public static void main(String[] args) {
        int num2 = 12345;
        digitsInNumber(num2);

    }
}
