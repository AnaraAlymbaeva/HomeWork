package edabit_begimai;

public class CodingBatString2 {

//    Return the number of times that the string "hi" appears anywhere in the given string.
//    countHi("abc hi ho") → 1
//    countHi("ABChi hi") → 2
//    countHi("hihi") → 2

    public int countHiOccurrences(String word) {
        int count = 0;
        for (int i = 0; i <= word.length() - 2; i++) {
            if (word.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

}
