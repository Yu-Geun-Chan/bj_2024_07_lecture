package org.koreait;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                numList.add(i);
            }
        }

        try {
            System.out.println(numList.get(n2 - 1));
        } catch (Exception e) {
            System.out.println(0);
        }
    }
}
