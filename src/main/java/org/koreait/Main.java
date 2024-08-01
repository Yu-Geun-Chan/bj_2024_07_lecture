package org.koreait;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        boolean isPrimeNumber;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    isPrimeNumber = false;
                }
            }
        }
        System.out.println(count);
    }
}



