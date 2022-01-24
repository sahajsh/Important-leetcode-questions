public class Solution {
    public int maxSubArray(int[] nums) {
        int maxval= Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
        
        if(curr>maxval){
            maxval=curr;
        }
        if(curr < 0){
            curr=0;
        } 
        }
       return maxval;
    }
}
