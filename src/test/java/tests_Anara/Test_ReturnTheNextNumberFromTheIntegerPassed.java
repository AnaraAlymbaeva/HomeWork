package tests_Anara;

import edabit_Anara.ReturnTheNextNumberFromTheIntegerPassed;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ReturnTheNextNumberFromTheIntegerPassed {
    ReturnTheNextNumberFromTheIntegerPassed nextNum = new ReturnTheNextNumberFromTheIntegerPassed();

    @Test
    void testNextNumber(){
        Test_ReturnTheNextNumberFromTheIntegerPassed returnTheNextNumberFromTheIntegerPassed = new Test_ReturnTheNextNumberFromTheIntegerPassed();
        Assert.assertEquals(nextNum.nextNumber(0), 1);
        Assert.assertEquals(nextNum.nextNumber(9), 10);
        Assert.assertEquals(nextNum.nextNumber(-3), -2);


    }




}
