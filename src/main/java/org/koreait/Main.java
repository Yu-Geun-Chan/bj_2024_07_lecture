package org.koreait;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine();

        String[] abcBits = cmd.split(" ");

        int[] abc = new int[3];

        for (int i = 0; i < abcBits.length; i++) {
            abc[i] = Integer.parseInt(abcBits[i]);
        }
        Arrays.sort(abc);

        if (abc[0] == abc[1] && abc[1] == abc[2]) {
            System.out.println(abc[0] + abc[1] + abc[2]);
        } else System.out.println(abc[0] + abc[1] - 1 + abc[0] + abc[1]);

        sc.close();
    }
}
