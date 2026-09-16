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

#MISSING NUMBER

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        for(int i=0;i<=n;i++){

            boolean found=false;

            for(int j=0;j<n;j++){
                if(i==nums[j]){
                    found=true;
                    break;
                }
            }

            if(!found){
                return i;
            }
            
        }
        return -1;
      
    }
}

// 1. visualize 
// 2.understand why to use variable like found
// 3.understand where should we write return  

#Count the Digits That Divide a Number

// Given an integer num, return the number of digits in num that divide num.
// An integer val divides nums if nums % val == 0.

class Solution {
    public int countDigits(int num) {
        
        int count=0;
        int original =num;
        while(num>0){
            int lastdigit=num%10;
            if(original%lastdigit==0){
                count++;
            }
            num=num/10;

        }
        return count;
    }
}
 
// one very very vital thing that one can know is......
// The input num you are sending 
// =>Is getting reduced in each step(changing)
// =>At last it is becoming 0

// Soo to check whether each digit of num is dividing num...FIRST your num should be stable and it should not change then only we can check....soo soo soo to keep num static or constant  without making it change 
// first only we are storing it in another variable to keep it static...bec we know that it will change afterwards ...soo first only we are making it safe ...prevention is better than cure
// See dry running your code very very very precisely by considering each line is very important 
// here you usually tend to miss original=num..you will get error
