package net.writeacode.java.prep.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SlideWindowSampleBasicTest {
    private SlideWindowSampleBasic basicSlider;
    @BeforeEach
    public void setUp(){
        basicSlider = new SlideWindowSampleBasic();
    }
    @Test
    public void testMaxSum(){
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        int k = 2;
        assertDoesNotThrow(() -> basicSlider.maxSum(nums, k));
    }
}
