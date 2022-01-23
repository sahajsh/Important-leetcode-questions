}
return val;
}
}
​
​
​
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
return maxValue;
}
}