package test;


import main.Solution;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Tests {

    @Test
    public void twoSumTest() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0,1}, solution.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

}
