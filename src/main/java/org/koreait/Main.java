package org.koreait;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String xy = "";
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i <= n; i++) {
            String cmd = sc.nextLine();
            xy += cmd + " ";
        }
        xy = xy.trim();

        String[] x_yBits = xy.split(" ");
        for (int i = 0; i < x_yBits.length / 2; i++) {
            x[i] = Integer.parseInt(x_yBits[i * 2]);
            y[i] = Integer.parseInt(x_yBits[i * 2 + 1]);
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println((x[x.length - 1] - x[0]) * (y[y.length - 1] - y[0]));
    }
}



