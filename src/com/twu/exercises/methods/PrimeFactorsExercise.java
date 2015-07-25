package com.twu.exercises.methods;

/**
 * Created by Vivi on 7/25/15.
 */
public class PrimeFactorsExercise {

    public void generate(int n) {
        int temp = n;
        for (int i = 2; i <= n; i++) {
            if (!isPrime(i)) {
                continue;
            }

            if (temp%i == 0) {
                System.out.println(i);
            }
        }

    }

    public boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;

    }
}
