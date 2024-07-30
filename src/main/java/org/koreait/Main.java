package org.koreait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = br.readLine();
            if (num == null) {
                break;
            }
            String[] numBits = num.split(" ");
            int a = Integer.parseInt(numBits[0]);
            int b = Integer.parseInt(numBits[1]);

            if (a == b) {
                break;
            }

            if (a > b) {
                if (a % b == 0) {
                    System.out.println("multiple");
                }
            } else if (b > a) {
                if (b % a == 0) {
                    System.out.println("factor");
                }
            } else {
                System.out.println("neither");
            }
        }
        br.close();
    }
}
