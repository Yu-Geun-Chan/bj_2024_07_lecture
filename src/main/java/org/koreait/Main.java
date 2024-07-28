package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String num = a + " " + b + " " + c;
        String[] nums = num.split(" ");
        int[] numsArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsArray[i] = Integer.parseInt(nums[i]);
        }
        if (numsArray[0] != numsArray[2] && numsArray[0] == numsArray[4]) {
            System.out.printf(numsArray[2] + " ");
        } else if (numsArray[0] != numsArray[4] && numsArray[0] == numsArray[2]) {
            System.out.printf(numsArray[4] + " ");
        } else System.out.printf(numsArray[0] + " ");
        if (numsArray[1] != numsArray[3] && numsArray[1] == numsArray[5]) {
            System.out.printf(numsArray[3] + " ");
        } else if (numsArray[1] != numsArray[5] && numsArray[1] == numsArray[3]) {
            System.out.printf(numsArray[5] + " ");
        } else System.out.printf(numsArray[1] + " ");
    }
}
