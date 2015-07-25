package com.twu.exercises.methods;

/**
 * Created by Vivi on 7/25/15.
 */
public class TriangleExercises {

    public void drawHorizontalLine(int n) {
        String string = "";
        for (int i=1;i<=n;i++) {
            string = string+"*";
        }
        System.out.println(string);
    }

    public void drawVerticalLine(int n) {
        String string = "";
        for (int i=1;i<=n;i++) {
            string = string+"*\n";
        }
        System.out.println(string);

    }

    public void drawRightTriangle(int n) {
        String string = "";
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                string = string + "*";
            }
            string = string+"\n";
        }
        System.out.println(string);

    }
}
