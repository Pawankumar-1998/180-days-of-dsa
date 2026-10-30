package arrays;

import java.util.Arrays;

public class MajorityElement {

//    this is the brute force approach which will take n log n time to solve due to sorting
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

//    this solution will take n time to solve the problem as we use the voting technique this is popularly knows as Moore's voting approach
    public int MooreVoting(int[] nums){
        int candidate = nums[0];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==candidate){
                count++;
            } else {
                count = count - 1;
                if (count==0){
                    candidate = nums[i];
                    count++;
                }
            }
        }
        return candidate;
    }

    static void main() {
        MajorityElement solution = new MajorityElement();
        int[] nums = {1,2,3,4,5,6,7};

        int ans = solution.majorityElement(nums);
        System.out.println(ans);

//        this is using the Voting Algorithm
        int MajorityCandidate = solution.MooreVoting(nums);
        System.out.println("This is using the mores voting algo " + MajorityCandidate);
    }
}
