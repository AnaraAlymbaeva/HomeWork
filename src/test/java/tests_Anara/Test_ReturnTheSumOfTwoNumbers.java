package tests_Anara;

import edabit_Anara.ReturnTheSumOfTwoNumbers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ReturnTheSumOfTwoNumbers {

     ReturnTheSumOfTwoNumbers sumOfTwoNumbers = new ReturnTheSumOfTwoNumbers();

    @Test
    public void testAdd(){
        Assert.assertEquals(sumOfTwoNumbers.add(3,2),5);
        Assert.assertEquals(sumOfTwoNumbers.add(-3,-6),-9);
        Assert.assertEquals(sumOfTwoNumbers.add(7,3),10);

    }
}
