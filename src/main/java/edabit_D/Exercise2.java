package edabit_D;

import java.util.Arrays;

public class Exercise2 {

    public static int[] arrayOfMultiples(int num, int length) {
        int [] a = new int [length];
        a[0] = num;
        for (int i =1; i < length; i++){
            int num1 = a[i-1]+num;
            a[i] = num1;
        }return a;
    }

}
