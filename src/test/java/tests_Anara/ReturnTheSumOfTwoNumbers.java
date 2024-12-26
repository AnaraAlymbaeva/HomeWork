package tests_Anara;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnTheSumOfTwoNumbers {
    public static int add(int a, int b){
        return a + b;
    }

    @Test
    void testAdd(){
        ReturnTheSumOfTwoNumbers returnTheSumOfTwoNumbers = new ReturnTheSumOfTwoNumbers();
        Assert.assertEquals(add (3, 2), 5);
        Assert.assertEquals(add (-3, -6), -9);
        Assert.assertEquals(add (7, 3), 10);

    }
}
