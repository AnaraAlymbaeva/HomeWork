package edabit_Anara;

public class FirstLast6 {
    public boolean firstLast6(int[] nums) {
        int firstEl = nums[0];
        int lastEl = nums[nums.length-1];
        if (firstEl == 6 || lastEl == 6){
            return true;
        }
        return false;
    }
}
