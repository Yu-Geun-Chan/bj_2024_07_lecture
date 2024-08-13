package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = num;
        for (int i = 0; i < num; i++) {
            String cmd = sc.next();
            for (int j = 0; j < cmd.length(); j++) {
                int count2 = count;
                for (int k = j + 2; k < cmd.length(); k++) {
                    if (j < cmd.length() - 2) {
                        if (cmd.charAt(j) != cmd.charAt(j + 1)) {
                            if (cmd.charAt(j) == cmd.charAt(k)) {
                                count--;
                                break;
                            }
                        }
                    }
                }
                if (count == count2 - 1)
                    break;
            }
        }
        System.out.println(count);
    }
}



