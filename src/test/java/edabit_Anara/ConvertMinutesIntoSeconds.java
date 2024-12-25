package edabit_Anara;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertMinutesIntoSeconds {
    public int convert(int minutes){
        return minutes * 60;
    }



    @Test
    void testConvert(){
        ConvertMinutesIntoSeconds convertMinutesIntoSeconds = new ConvertMinutesIntoSeconds();
        Assert.assertEquals(convert(5), 300);
        Assert.assertEquals(convert(3), 180);
        Assert.assertEquals(convert(2), 120);

    }
}
