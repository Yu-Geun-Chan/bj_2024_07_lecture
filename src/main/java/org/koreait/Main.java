package org.koreait;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();
        int sum = -1;
        List<Integer> arr = new ArrayList<Integer>();


        for (int i = min; i <= max; i++) {
            // 소수인지 판별할 논리형 타입 check 변수 선언
            boolean check = true;
            // i가 1이라면 소수가 아니므로 check에 false 저장
            if (i == 1) {
                check = false;
            }
            // i가 j로 나눠지면 소수가 아니므로 check에 false 저장
            for (int j = 2; j <= i; j++) {
                if (j != i && i % j == 0) {
                    check = false;
                    break;
                }
            }
            // check가 true라면 소수이므로
            if (check) {
                arr.add(i);
                sum += i;
            }
        }
        if (sum == -1) {
            System.out.println(sum);
        } else {
            System.out.println(sum + 1);
            System.out.println(arr.get(0));
        }
    }
}



