package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to5() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 3;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 6, 5, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }

}