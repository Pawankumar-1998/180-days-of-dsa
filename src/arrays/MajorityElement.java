package arrays;

import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums){
        Arrays.sort(nums);

        int i =0;
        int j=0;
        int count = 0;
        while (j< nums.length){
            if (nums[i]==nums[j]){
                count++;
                j++;
            } else{
                if(count>nums.length){
                    return nums[i];
                }else {
                    i = j;
                    count = 0;
                }
            }
        }
        return nums[i];
    }

    static void main() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int ans = solution.majorityElement(nums);
        System.out.println(ans);
    }
}
