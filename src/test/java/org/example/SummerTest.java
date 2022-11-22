package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SummerTest {

    @Test
    @DisplayName("Given an array of integers 1 to 5, expect 15")
    void sumArray_GivenAnArray1To5_Expect15() {

        int[] myInts = {1, 2, 3, 4, 5};
        Summer summer = new Summer();
        assertEquals(15, summer.sumArray(myInts));

    }

    @Test
    @DisplayName("Given a list of coins in penny value, expect 183")
    void sumArray_GivenCoinList_Expect188(){

        int[] myInts = {100, 50, 20, 10, 5 , 2, 1};
        Summer summer = new Summer();
        assertEquals(188, summer.sumArray(myInts));
    }
}