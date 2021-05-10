package edu.impacta.atividade.model;


import org.junit.Test;

import static org.junit.Assert.*;

public class TestPalindrome {

    @Test
    public void testPalindromeIsTrue() {
        Palindrome palindrome = new Palindrome("bob");
        assertTrue(palindrome.validText());
    }

    @Test
    public void testPalindromeIsFalse() {
        Palindrome palindrome = new Palindrome("elephant");
        assertFalse(palindrome.validText());
    }
}
