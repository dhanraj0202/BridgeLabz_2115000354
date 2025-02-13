import java.util.*;

public class CheckPair{
    public static boolean hasPairWithSum(int[] nums, int target){
        Set<Integer> seenNumbers = new HashSet<>();

        for(int num : nums){
            int complement = target - num;
            if(seenNumbers.contains(complement)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1, 4, 45, 6, 10, 8};
        int target = 16;

        System.out.println(hasPairWithSum(nums, target) ? "Pair exists" : "No pair found");
    }
}
