package org.koreait;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String alpabet = sc.nextLine();
        String[] alpabetBits = alpabet.split("");
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0, countG = 0, countH = 0;
        int countI = 0, countJ = 0, countK = 0, countL = 0, countM = 0, countN = 0, countO = 0, countP = 0;
        int countQ = 0, countR = 0, countS = 0, countT = 0, countU = 0, countV = 0;
        int countW = 0, countX = 0, countY = 0, countZ = 0;

        for (int i = 0; i < alpabetBits.length; i++) {
            if (alpabetBits[i].equals("A") || alpabetBits[i].equals("a")) {
                countA++;
            } else if (alpabetBits[i].equals("B") || alpabetBits[i].equals("b")) {
                countB++;
            } else if (alpabetBits[i].equals("C") || alpabetBits[i].equals("c")) {
                countC++;
            } else if (alpabetBits[i].equals("D") || alpabetBits[i].equals("d")) {
                countD++;
            } else if (alpabetBits[i].equals("E") || alpabetBits[i].equals("e")) {
                countE++;
            } else if (alpabetBits[i].equals("F") || alpabetBits[i].equals("f")) {
                countF++;
            } else if (alpabetBits[i].equals("G") || alpabetBits[i].equals("g")) {
                countG++;
            } else if (alpabetBits[i].equals("H") || alpabetBits[i].equals("h")) {
                countH++;
            } else if (alpabetBits[i].equals("I") || alpabetBits[i].equals("i")) {
                countI++;
            } else if (alpabetBits[i].equals("J") || alpabetBits[i].equals("j")) {
                countJ++;
            } else if (alpabetBits[i].equals("K") || alpabetBits[i].equals("k")) {
                countK++;
            } else if (alpabetBits[i].equals("L") || alpabetBits[i].equals("l")) {
                countL++;
            } else if (alpabetBits[i].equals("M") || alpabetBits[i].equals("m")) {
                countM++;
            } else if (alpabetBits[i].equals("N") || alpabetBits[i].equals("n")) {
                countN++;
            } else if (alpabetBits[i].equals("O") || alpabetBits[i].equals("o")) {
                countO++;
            } else if (alpabetBits[i].equals("P") || alpabetBits[i].equals("p")) {
                countP++;
            } else if (alpabetBits[i].equals("Q") || alpabetBits[i].equals("q")) {
                countQ++;
            } else if (alpabetBits[i].equals("R") || alpabetBits[i].equals("r")) {
                countR++;
            } else if (alpabetBits[i].equals("S") || alpabetBits[i].equals("s")) {
                countS++;
            } else if (alpabetBits[i].equals("T") || alpabetBits[i].equals("t")) {
                countT++;
            } else if (alpabetBits[i].equals("U") || alpabetBits[i].equals("u")) {
                countU++;
            } else if (alpabetBits[i].equals("V") || alpabetBits[i].equals("v")) {
                countV++;
            } else if (alpabetBits[i].equals("W") || alpabetBits[i].equals("w")) {
                countW++;
            } else if (alpabetBits[i].equals("X") || alpabetBits[i].equals("x")) {
                countX++;
            } else if (alpabetBits[i].equals("Y") || alpabetBits[i].equals("y")) {
                countY++;
            } else if (alpabetBits[i].equals("Z") || alpabetBits[i].equals("z")) {
                countZ++;
            }
        }
        Map<Character,Integer> alpabetMap = new HashMap<>();
        alpabetMap.put('A', countA);
        alpabetMap.put('B', countB);
        alpabetMap.put('C', countC);
        alpabetMap.put('D', countD);
        alpabetMap.put('E', countE);
        alpabetMap.put('F', countF);
        alpabetMap.put('G', countG);
        alpabetMap.put('H', countH);
        alpabetMap.put('I', countI);
        alpabetMap.put('J', countJ);
        alpabetMap.put('K', countK);
        alpabetMap.put('L', countL);
        alpabetMap.put('M', countM);
        alpabetMap.put('N', countN);
        alpabetMap.put('O', countO);
        alpabetMap.put('P', countP);
        alpabetMap.put('Q', countQ);
        alpabetMap.put('R', countR);
        alpabetMap.put('S', countS);
        alpabetMap.put('T', countT);
        alpabetMap.put('U', countU);
        alpabetMap.put('V', countV);
        alpabetMap.put('W', countW);
        alpabetMap.put('X', countX);
        alpabetMap.put('Y', countY);
        alpabetMap.put('Z', countZ);

        Integer maxValue = Collections.max(alpabetMap.values());
        System.out.println(maxValue);

    }
}



