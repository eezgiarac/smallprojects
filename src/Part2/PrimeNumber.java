package Part2;

public class PrimeNumber {//asal

    public static void main(String[] args) {//karekokune kadar bak
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
        int num = 1;

        if (num == 0 || num == 1) {
            System.out.println("NO NO NO");
        } else {
            int count = 0;
            for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count >= 1) {
                System.out.println("NO NO NO");
                System.exit(1);
            }else {
                System.out.println("Prime ! : " + num);
            }
        }
       // System.out.println((int) Math.sqrt(num));
    }

}
