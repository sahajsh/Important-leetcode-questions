class Solution {
    public boolean isPalindrome(int x) {
           if(x==0) return true;
    
    if(x<0 || x%10==0 ) return false;
    
    int reverse = 0;
    
    while(x > reverse){
        int lastDigit = x % 10;
        x = x/10;
        
        reverse = (reverse*10)+lastDigit;
    }
    
    if(x==reverse || reverse/10 == x) return true;
    
    return false;
}
        
    }
