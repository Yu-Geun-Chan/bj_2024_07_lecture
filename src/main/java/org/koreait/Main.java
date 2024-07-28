package org.koreait;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] nums = new int[4];
        nums[0] = a - 0;
        nums[1] = b - 0;
        nums[2] = c - a;
        nums[3] = d - b;
        Arrays.sort(nums);
        System.out.println(nums[0]);
    }
}
