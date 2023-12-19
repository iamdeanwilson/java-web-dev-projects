package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAroundTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void outOfPlaceBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void closedBracketsToStartReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringWithOnlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void stringWithOutOfOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void oddNumberOfBracketsReturnsFalse1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }

    @Test
    public void oddNumberOfBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }
    @Test
    public void oddNumberOfBracketsReturnsFalse3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code]"));
    }
    @Test
    public void oddNumberOfBracketsReturnsFalse4() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[La[unc]h[Code["));
    }

    @Test
    public void doubleClosedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    @Test
    public void bracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Lau[nchC]ode]"));
    }

    @Test
    public void textWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }

}