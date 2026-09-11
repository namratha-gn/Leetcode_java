#REVERSE INTEGER

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

class Solution {
    public int reverse(int x) {

        if(x/10==0) return x;
        int rev=0;
        while(x!=0){
            int lastdigit=x%10;
            if((rev>Integer.MAX_VALUE/10)||(rev==Integer.MAX_VALUE/10 && lastdigit>7) ||(rev<Integer.MIN_VALUE/10) || (rev==Integer.MIN_VALUE/10 && lastdigit<-8)){
                return 0;
            }
            rev=rev*10+lastdigit;
            x=x/10;
        }
        return rev;
        
    }
}

#PALINDROME NUMBER

//Given an integer x, return true if x is a palindrome, and false otherwise.


class Solution {
    public boolean isPalindrome(int x) {
        
        int origin=x;
        if(x<0) return false;
        if(x/10==0) return true;
        int reverse=0;
        
        while(x>0){
        int lastdigit=x%10;
        reverse=reverse*10+lastdigit;
        x=x/10;

        }
        return reverse==origin;
        

    }
}

 

