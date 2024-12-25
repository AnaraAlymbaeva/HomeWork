package edabit_Anara;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnTheNextNumberFromTheIntegerPassed {
    public int nextNumber(int num){
        return num + 1;
    }


    @Test
    void testNextNumber(){
        ReturnTheNextNumberFromTheIntegerPassed returnTheNextNumberFromTheIntegerPassed = new ReturnTheNextNumberFromTheIntegerPassed();
        Assert.assertEquals(nextNumber(0), 1);
        Assert.assertEquals(nextNumber(9), 10);
        Assert.assertEquals(nextNumber(-3), -2);


    }




}
