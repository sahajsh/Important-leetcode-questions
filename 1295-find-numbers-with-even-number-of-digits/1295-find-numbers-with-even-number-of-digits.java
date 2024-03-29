class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    boolean even(int num){
        int noDigits=digits(num);
        return noDigits%2==0;
    }
        int digits(int num){
            int count=0;
            while(num>0){
                count++;
                num=num/10;
            }
            return count;
        }
    }
