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

            // 마지막에 -1을 입력 받으면 무한루프를 탈출하기 위한 조건식
            if (nums.equals("-1")) {
                break;
            }

            List<Integer> numsList = new ArrayList<>();
            // 약수인 경우에 numList에 저장하기 위한 반복문 시작
            // i가 Integer.parseInt(nums)까지인 이유는 입력받은 숫자는 제외하기 위해서.
            for (int i = 1; i < Integer.parseInt(nums); i++) {
                if (Integer.parseInt(nums) % i == 0) {
                    numsList.add(i);
                }
            }
            // 여기까지

            // 완전수인지 아닌지 판별하기 위한 변수 선언
            int numsSum = 0;

            // 약수의 합을 저장하기 위한 반복문 시작
            for (int i = 0; i < numsList.size(); i++) {
                numsSum += numsList.get(i);
            }
            // 여기까지

            // numsSum에 저장되어 있는 값(약수의 합)이 입력받은 nums의 값과 같다면 완전수 이므로
            // 올바르게 출력하기 위한 반복문 시작
            if (numsSum == Integer.parseInt(nums)) {
                System.out.print(nums + " = ");
                for (int i = 0; i < numsList.size(); i++) {
                    System.out.print(numsList.get(i));
                    // 맨 마지막 숫자의 뒤에 " + " 를 붙이지 않게 하기 위한 조건
                    if (i != numsList.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
                // 여기까지
            } else if (numsSum != Integer.parseInt(nums)) {
                System.out.println(Integer.parseInt(nums) + " is NOT perfect.");
            }
        }
        br.close();
    }
}

