package org.koreait;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int xMax = 0;
        int xMin = 0;

        int yMax = 0;
        int yMin = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());


            if (i == 0) {
                xMin = x;
                yMin = y;
                xMax = x;
                yMax = y;
            }
            if (x > xMax)
                xMax = x;
            if (x < xMin)
                xMin = x;
            if (y > yMax)
                yMax = y;
            if (y < yMin)
                yMin = y;
        }
        if (n == 1) {
            System.out.println(0);
        } else System.out.println((xMax - xMin) * (yMax - yMin));
    }
}




