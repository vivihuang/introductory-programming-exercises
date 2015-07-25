package com.twu.exercises.methods;

/**
 * Created by Vivi on 7/25/15.
 */
public class DiamondExercises {

    public String drawIsoscelesTriangle(int n) {
        String string = "";
        int maxLineTriangle = 2*n-1;
        for (int i=1;i<=n;i++) {
            int thisLineTriangle = 2*i-1;
            int thisLineSpace = (maxLineTriangle-thisLineTriangle)/2;
            string += getIsoscelesTriangleString(thisLineSpace, thisLineTriangle);
        }
        return string;
    }

    public String drawInverseIsoscelesTriangle(int n) {
        String string = "";
        int maxLineTriangle = 2*n-1;
        for (int i=n-1;i>=1;i--) {
            int thisLineTriangle = 2*i-1;
            int thisLineSpace = (maxLineTriangle-thisLineTriangle)/2;
            string += getIsoscelesTriangleString(thisLineSpace, thisLineTriangle);
        }
        return string;
    }

    public String drawDiamondWithName(int n) {
        String string = "";
        int maxLineTriangle = 2*n-1;
        for (int i=1;i<n;i++) {
            int thisLineTriangle = 2*i-1;
            int thisLineSpace = (maxLineTriangle-thisLineTriangle)/2;
            string += getIsoscelesTriangleString(thisLineSpace, thisLineTriangle);
        }
        string += "Vivi\n"+drawInverseIsoscelesTriangle(3);
        return string;
    }

    public String drawCenteredDiamond(int n) {
        String string = drawIsoscelesTriangle(n) + drawInverseIsoscelesTriangle(n);
        return string;
    }

    public String getIsoscelesTriangleString(int thisLineSpace,int thisLineTriangle) {
        String string = "";
        for (int j=1;j<=thisLineSpace;j++) {
            string += " ";
        }
        for (int j=1;j<=thisLineTriangle;j++) {
            string += "*";
        }
        string += "\n";
        return string;
    }
}
