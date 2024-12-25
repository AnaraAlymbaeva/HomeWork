package my_tests;

import edabit_D.Exercise1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void test1 (){
        Exercise1 ex = new Exercise1();
        Assert.assertEquals(ex.squarePatch(3), new int[][]{{3, 3, 3}, {3, 3, 3}, {3, 3, 3}});
    }
}
