package Part3;

public class PrimeNumber {//asal
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
        int num = 29;
        boolean isPrime = false;

        if (num<0){
            System.err.println("Prime numbers can not be negative!");
            System.exit(1);
        }
        if (num == 0 || num == 1) {
            isPrime = false;
        } else {

            for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }else{
                    isPrime = true;
                }
            }
        }
        System.out.println("number is prime : " + isPrime);
    }

}
