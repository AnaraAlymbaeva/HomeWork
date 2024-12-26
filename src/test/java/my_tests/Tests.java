package my_tests;

import edabit_D.Exercise1;
import edabit_D.Exercise2;
import edabit_D.Exercise3;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void test1 (){
        Exercise1 ex = new Exercise1();
        Assert.assertEquals(ex.squarePatch(3), new int[][]{{3, 3, 3}, {3, 3, 3}, {3, 3, 3}});
    }
    @Test
    public void test2(){
        Assert.assertEquals(Exercise2.arrayOfMultiples(4,3), new int[] {4,8,12});
    }
    @Test
    public void test3(){
        Assert.assertEquals(Exercise3.otherSides(3),new double[]{3*2,3*1.73});
    }
}
