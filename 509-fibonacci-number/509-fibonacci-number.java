class Solution {
    public int fib(int n) {
        int i =0;
        int j =1;
        int k=0;
        for(int c =0;c<n;c++){
            k=i+j;//1
            i=j;//1
            j=k;//1
        }
        return i;
        
    }
} 
//0 1 1   2 3 5 8 13