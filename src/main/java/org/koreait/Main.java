package org.koreait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] lines = new int[3];

        while (true) {

        String line = br.readLine();
        if (line == null) {
            break;
        }

        String[] inputs = line.split(" ");
        lines[0] = Integer.parseInt(inputs[0]);
        lines[1] = Integer.parseInt(inputs[1]);
        lines[2] = Integer.parseInt(inputs[2]);
        Arrays.sort(lines);

        if (lines[0] == 0 && lines[1] == 0 && lines[2] == 0) {
            break;
        }
        if (lines[2] >= lines[0] + lines[1]) {
            System.out.println("Invalid");
        } else if (lines[0] == lines[1] && lines[1] == lines[2]) {
            System.out.println("Equilateral ");
        } else if (lines[0] != lines[1] && lines[1] != lines[2]) {
            System.out.println("Scalene");
        } else System.out.println("Isosceles");

        }
        br.close();
    }
}
