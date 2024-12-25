import edabit_begimai.CodingBatString2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCodingBatString2 {

    private final CodingBatString2 mainClass = new CodingBatString2();

    @DataProvider(name = "string hi")
    public Object[][] stringHi() {
        return new Object[][]{
                {"abc hi ho", 1},
                {"ABChi hi", 2},
                {"hihi", 2},
                {"Hihello", 0},
        };
    }

    @Test(dataProvider = "string hi")
    public void countStringHi(String word, int expectedCount) {
        int actualCount = mainClass.countHiOccurrences(word);
        System.out.println("Word: " + word + ", Count of 'hi': " + actualCount);
        Assert.assertEquals(actualCount, expectedCount, "The counts do not match!");
    }


}
