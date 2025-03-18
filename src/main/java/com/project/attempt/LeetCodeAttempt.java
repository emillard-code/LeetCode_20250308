package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(minimumRecolorsToGetKConsecutiveBlackBlocks("WBBWWBBWBW", 7));

        System.out.println(minimumRecolorsToGetKConsecutiveBlackBlocks("WBWBBBW", 2));

    }

    public static int minimumRecolorsToGetKConsecutiveBlackBlocks(String blocks, int k) {

        int minimumRecolors = blocks.length();

        for (int i = 0; i <= blocks.length() - k; i++) {

            int requiredRecolors = 0;

            for (int j = i; j < i + k; j++) {

                if (blocks.charAt(j) == 'W') { requiredRecolors++; }

            }

            if (requiredRecolors < minimumRecolors) { minimumRecolors = requiredRecolors; }

        }

        return minimumRecolors;


    }

}
