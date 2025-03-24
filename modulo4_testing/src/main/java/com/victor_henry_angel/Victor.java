package com.victor_henry_angel;

import java.util.ArrayList;
import java.util.List;

public class Victor {
    public  List<Integer> getPrimes(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public  boolean isPrime(int number) {
        if (number < 0) {  
            number = Math.abs(number);  
        }
        if (number < 2)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
