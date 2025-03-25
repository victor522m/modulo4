package com.victor_henry_angel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class VictorTest {
    Victor victor = new Victor();
    @Test
    void testGetPrimes() {
         List<Integer> primes = victor.getPrimes(10, 23);
         List<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        expectedPrimes.add(19);
        expectedPrimes.add(23);
        assertEquals(primes, expectedPrimes);
    }
    
    @Test
    void testGetPrimesWithNoPrimes() {
        List<Integer> primes = victor.getPrimes(20, 22);
        assertTrue(primes.isEmpty());
    }
    
    @Test
    void testIsPrimeWithPrimeNumber() {
        assertTrue(victor.isPrime(7));
    }
    
    @Test
    void testIsPrimeWithNonPrimeNumber() {
        assertFalse(victor.isPrime(10));
    }
    
    @Test
    void testIsPrimeWithEdgeCases() {
        assertFalse(victor.isPrime(1));
        assertTrue(victor.isPrime(2));
    }
}
