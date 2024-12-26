package tests_Anara;

import edabit_Anara.ConvertMinutesIntoSeconds;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ConvertMinutesIntoSeconds{

    ConvertMinutesIntoSeconds convertMin = new ConvertMinutesIntoSeconds();

    @Test
    void testConvert(){

        Assert.assertEquals(convertMin.convert(5), 300);
        Assert.assertEquals(convertMin.convert(3), 180);
        Assert.assertEquals(convertMin.convert(2), 120);

    }
}
