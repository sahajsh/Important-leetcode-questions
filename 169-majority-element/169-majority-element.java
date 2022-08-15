class Solution{
    public int majorityElement(int[] nums){
        // moore voting algorithm
        int maxValue= nums[0];
        int count =1;
        for(int i =1;i<nums.length;i++){
            if(maxValue==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maxValue=nums[i];
                count=1;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            c++;
        }
        if(c>nums.length/2){
            return maxValue;
        }else{
            return -1;
        }
}
}