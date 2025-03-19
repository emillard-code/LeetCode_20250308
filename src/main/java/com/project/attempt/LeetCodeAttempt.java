package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(minimumRecolorsToGetKConsecutiveBlackBlocks("WBBWWBBWBW", 7));

        System.out.println(minimumRecolorsToGetKConsecutiveBlackBlocks("WBWBBBW", 2));

    }

    // This method calculates the minimum number of recolors needed to get k consecutive black blocks.
    public static int minimumRecolorsToGetKConsecutiveBlackBlocks(String blocks, int k) {

        // We will store the answer in int minimumRecolors. We will initially set it
        // to a default of the length of string blocks as that is the maximum possible
        // value that the answer could be in any hypothetical situation.
        int minimumRecolors = blocks.length();

        // We will loop through string blocks, looking at int k characters at a time.
        for (int i = 0; i <= blocks.length() - k; i++) {

            // For each loop, we will record how many 'W' characters are found from the
            // current index to the next k characters and store it within int requiredRecolors.
            int requiredRecolors = 0;

            // We will look at int k characters at a time, recording how many 'W' characters are
            // found so that we know the exact amount of operations that would be needed to achieve
            // turning this section of string blocks into consecutive 'B' characters.
            for (int j = i; j < i + k; j++) {

                if (blocks.charAt(j) == 'W') { requiredRecolors++; }

            }

            // If the number of operations needed to turn this block of int k characters into
            // all 'B' characters is less than the current value of int minimumRecolors, then
            // we overwrite the value of int minimumRecolors with int requiredColors.
            if (requiredRecolors < minimumRecolors) { minimumRecolors = requiredRecolors; }

        }

        // After all the logic has been performed, we return the final value of int minimumRecolors.
        return minimumRecolors;


    }

}
