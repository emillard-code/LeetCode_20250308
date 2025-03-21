package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void minimumRecolorsTest() {

        assertEquals(3, LeetCodeSolution.minimumRecolors("WBBWWBBWBW", 7));

        assertEquals(0, LeetCodeSolution.minimumRecolors("WBWBBBW", 2));

    }

}
