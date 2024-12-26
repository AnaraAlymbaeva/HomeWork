package tests_Anara;

import edabit_Anara.FirstLast6;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_FirstLast6 {

    FirstLast6 firstLast6 = new FirstLast6();

    @Test
    public void testFirstLast6(){

        int[] nums = {1, 2, 6};
        Assert.assertTrue(firstLast6.firstLast6(nums));
    }
    @Test
    public void testFirstLast6_2(){
        int[] nums = {13, 6, 1, 2, 3};
        Assert.assertFalse(firstLast6.firstLast6(nums));
    }

}
