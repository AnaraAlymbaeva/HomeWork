package edabit_D;

import java.util.Arrays;

public class Exercise3 {

    public static double[] otherSides(int n) {
        return new double[]{n*2,n* 1.73};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Exercise3.otherSides(3)));
    }
}
