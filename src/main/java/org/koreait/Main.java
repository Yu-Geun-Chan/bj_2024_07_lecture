package org.koreait;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String nums = br.readLine();

            if (nums.equals("-1")) {
                break;
            }

            List<Integer> numsList = new ArrayList<>();
            for (int i = 1; i < Integer.parseInt(nums); i++) {
                if (Integer.parseInt(nums) % i == 0) {
                    numsList.add(i);
                }
            }
            int numsSum = 0;

            for (int i = 0; i < numsList.size(); i++) {
                numsSum += numsList.get(i);
            }
            if (numsSum == Integer.parseInt(nums)) {
                System.out.print(nums + " = ");
                for (int i = 0; i < numsList.size(); i++) {
                    System.out.print(numsList.get(i));
                    if (i != numsList.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else if (numsSum != Integer.parseInt(nums)) {
                System.out.println(Integer.parseInt(nums) + " is NOT perfect.");
            }
        }
        br.close();
    }
}

