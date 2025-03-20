package com.project.solution;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCodeSolution {

    public static void main(String[] args) {

        System.out.println(minimumRecolors("WBBWWBBWBW", 7));

        System.out.println(minimumRecolors("WBWBBBW", 2));

    }

    public static int minimumRecolors(String blocks, int k) {

        Queue<Character> blockQueue = new LinkedList<>();
        int numWhites = 0;

        // Initiate queue with first k values
        for (int i = 0; i < k; i++) {

            char currentChar = blocks.charAt(i);
            if (currentChar == 'W') numWhites++;
            blockQueue.add(currentChar);

        }

        // Set initial minimum
        int numRecolors = numWhites;

        for (int i = k; i < blocks.length(); i++) {

            // Remove front element from queue and update current number of white blocks
            if (blockQueue.poll() == 'W') numWhites--;

            // Add current element to queue and update current number of white blocks
            char currentChar = blocks.charAt(i);
            if (currentChar == 'W') numWhites++;
            blockQueue.add(currentChar);

            // Update minimum
            numRecolors = Math.min(numRecolors, numWhites);

        }

        return numRecolors;

    }

}
