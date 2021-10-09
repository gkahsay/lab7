package Assignment6;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println( "Enter any number");
        int n = input.nextInt();
        boolean isPrime = isPrime(n);

        System.out.println( isPrime);

    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    }

