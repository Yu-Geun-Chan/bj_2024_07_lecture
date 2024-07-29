package org.koreait;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String point = "";
        for (int i = 0; i <= n; i++) {
            String cmd = sc.nextLine();
            point += cmd + " ";
        }
        point = point.trim();

        int[] pointRow = new int[point.split(" ").length / 2];
        int[] pointColumn = new int[point.split(" ").length / 2];
        for (int i = 0; i < point.split(" ").length / 2; i++) {
            pointRow[i] = Integer.parseInt(point.split(" ")[i * 2]);
            pointColumn[i] = Integer.parseInt(point.split(" ")[1 + i * 2]);
        }
        Arrays.sort(pointRow);
        Arrays.sort(pointColumn);
        System.out.println((pointRow[pointRow.length - 1] - pointRow[0]) * (pointColumn[pointColumn.length - 1] - pointColumn[0]));

    }
}
