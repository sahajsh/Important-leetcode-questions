It assigns negative number to max already in the first run
public class Solution {
public int maxSubArray(final int[] A) {
int max=Integer.MIN_VALUE;
int currsum =0;
for(int i =0;i<A.length;i++){
currsum = currsum+ A[i];
if(currsum>max){
max = currsum;
}
if(currsum < 0){
currsum=0;
}
}
return max;
}
}
​