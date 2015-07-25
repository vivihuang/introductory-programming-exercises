package com.twu.exercises;

import com.twu.exercises.methods.*;

/**
 * Created by Vivi on 7/25/15.
 */
public class ExerciseApp {

    private static TriangleExercises triangleExercises = new TriangleExercises();
    private static DiamondExercises diamondExercises = new DiamondExercises();
    private static FizzBuzzExercise fizzBuzzExercise = new FizzBuzzExercise();
    private static PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();

    public static void main(String[] args){
        triangleExercises.drawHorizontalLine(8);
        triangleExercises.drawVerticalLine(3);
        triangleExercises.drawRightTriangle(3);

        System.out.println(diamondExercises.drawIsoscelesTriangle(3));
        System.out.println(diamondExercises.drawCenteredDiamond(3));
        System.out.println(diamondExercises.drawDiamondWithName(3));

        fizzBuzzExercise.FizzBuzz(15);

        primeFactorsExercise.generate(30);
    }
}
