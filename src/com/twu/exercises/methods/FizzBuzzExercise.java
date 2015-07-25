package com.twu.exercises.methods;

import java.util.Scanner;

/**
 * Created by Vivi on 7/25/15.
 */
public class FizzBuzzExercise {

    public void FizzBuzz(int maxNumber) {
        String string= "";
        for (int i=1;i<=maxNumber;i++) {
            string += calculateNumberDivisible(i);
        }
        System.out.println(string);
    }

    public String calculateNumberDivisible(int number) {
        String string = "";
        if (number%15 == 0) {
            string = "FizzBuzz";
        }
        else if (number%3 == 0) {
           string = "Fizz";
        }
        else if (number%5 == 0) {
            string = "Buzz";
        }
        else {
            string = Integer.toString(number);
        }
        return string+"\n";
    }
}
