package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void minimumRecolorsToGetKConsecutiveBlackBlocksTest() {

        assertEquals(3, LeetCodeAttempt.minimumRecolorsToGetKConsecutiveBlackBlocks("WBBWWBBWBW", 7));

        assertEquals(0, LeetCodeAttempt.minimumRecolorsToGetKConsecutiveBlackBlocks("WBWBBBW", 2));

    }

}
