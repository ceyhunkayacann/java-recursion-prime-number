import java.util.Scanner;

public class PrimeNumber {
    static int i = 2;

    static boolean isPrime(int n){


        if(i == n / 2 + 1) {
            return true;
        }

        if (n % i == 0){
            return false;
        }
        i++;
        return isPrime(n);
    }

    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Number : ");
        n = input.nextInt();

        if(isPrime(n)){
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is NOT a prime number");
        }
    }
}
