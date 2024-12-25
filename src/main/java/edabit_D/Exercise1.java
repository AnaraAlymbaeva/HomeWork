package edabit_D;

import java.util.Arrays;

public class Exercise1 {

    public int[][] squarePatch(int n) {
        int [][] a = new int [n][n];
        for(int i =0; i< n;i++){
           for (int j = 0; j< n ; j++){
               a[i][j] = n;
           }
        }return a;
    }
}
