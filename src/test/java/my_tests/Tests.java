package my_tests;

import edabit_D.Exercise1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    Exercise1 ex = new Exercise1();

    @Test
    public void test1 (){
        Assert.assertEquals(ex.squarePatch(3), new int[][]{{3, 3, 3}, {3, 3, 3}, {3, 3, 3}});
    }
}
