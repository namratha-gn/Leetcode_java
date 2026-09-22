
//LEETCODE LEARNINGS

//first read the question correctly until until until you undertood it perfectly ...very perfectly ..then only you'll get the correct logic
//then see the constrains ==>the inputs they provide for your code...clearly see the inputs that tehy are giving...think whether they are giving large inpputs like 2**31 then it is very large soo you have ro write code to manage that large input...keep it in  mind nad write your code..depending on that input largness or smallest..your question become seasy or medium tagged
//never write function inside another function in java
//you can write like this also int n =callfun(n);   //while sending  n to the function it is of some value and after the function returns something ...the n is getting changes to itself
//don't ever define any veriable as 0 (ex:count=0) inside the loop define it or initialize it outside the loop bec after each loop it again becomes 0 if you do soo.no updation will be there..it comes back to starting point
//check condition inside while loop...loop ....check condition...loop...check condition ...loop increment 
//edge cases means some input that breaks your code...
//read question ...then see constraints..===> constraints means the posiible input they give to test your code
//one work is happening(Ex.reversing a  num) then put it separately inside the function
//something that is happening multiple time sthen  keep them inside the new function and call that  function
//Dry running your code very very very precisely is most important ....just dry run everything that is hapening in each line of your code
//you are using a variable called i or j inside the for loop right....i=1;i<=10;i++....this i numbers can be using inside the loop by using i or you can skip(you are skipping means just you are concentratiing no of times the loop should run not having the intention to use i inside the loop)...soo there are 2 options think!!! this 2 points before using them
//Math.pow always return double in java
//continue means “stop the current iteration of the loop and immediately go to the next iteration.”
// break means get out from the loop
//something is repeating means====> think!! put it in a function...calll it call it multiple times acc to condition
//convert  number from base 10 to base k means ===>divide number repeatedly by k...and get remainders one by one and sum it up...
//if you do from front or back also...sum means sum(eg. 1+5+6 ==6+5+1)
//very very very important thing here is ...
//int remainder=n%k or int lastdigit=n%10;........here n will not change n will stay same...to modify/change/reduce n we do n=n/10...we reduce because at soem time it becomes <0...sooo our loop ends while(n>0) why we write this condition means?? at some time n becomes 0 
//Don't ever use inbuilt mathods inside the leetcode problem..try to do it in manual method ..
//if your variable overflows also leetcode..shows Time limit exceed (before using i*i in loop think will it overflow like that)

// In java how to access the characters of a string ??
// not just index method str[0]==> wrong(this is in js)
// str.charAt(0)===> correct

// A prime factor is a prime number that divides another number.
// Prime factorization is defined for positive integers greater than 1.
// For example:
// 12 → 2 × 2 × 3
// 18 → 2 × 3 × 3
// 1 → no prime factors
// 0 → no prime factorization

// nums is an array, and in Java an array's size is a property, not a method.
// So:
// nums.length
// ✅ Correct
// nums.length()
// ❌ Wrong

// alwaya a function should be returned something 
// that return should be  written  before the close bracket of function
// you can write return inside any operation , loop , or if statetemt 
// but you should ask yourself the question ...whta if thta condition doesn't execute????.....soo always return something to the function (if nothing return -1)

// Easy rule to remember
// Java type	Length
// String	str.length() ✅
// Array	arr.length ✅

// In javaScript str[0]...In java str.charAt(0)-'0'
// Here str.charAt(0) is a character ....you cannot comapre this character with ,any integer (if you wnat in any situation) ..soo str.charAt(0)-'0'...this internally comapares thier unicodes and gives output a integer 
// if sound=true ..break;(this situation may exits in many conditions)...true to use this found kin dof avriables in your code

// one very very vital thing that one can know is......
// The input num you are sending 
// =>Is getting reduced in each step(changing)
// =>At last it is becoming 0

// Soo to check whether each digit of num is dividing num...FIRST your num should be stable and it should not change then only we can check....soo soo soo to keep num static or constant  without making it change 
// first only we are storing it in another variable to keep it static...bec we know that it will change afterwards ...soo first only we are making it safe ...prevention is better than cure


// number=count

// to covert from integer to string (in java)==> String.valueOf()

// to convert from string to Integer(in java)===>
// Integer.parseInt()

// to cut a part of string in java==>string.substring(start,end+1)

// To check if integer is single digit==>
// integer/10==0; or integer<10;
// To check no. of digits in a integer==>
// int(Math.count()+1e-9);

// To check no. of digits in string==>
// string.length();
// To check a string contains even no. digits==>
// string.length()/2==0
// To check a string contains odd no. of digits==>
// string.length()/2!=0

//%2==0 means it is dividing by 2 completely
//%10==0 means it is  dividing by 10 completely (there is another imp meaning also)
//%25==0 means it is diving by 25 completely...whne you see this sytax ....just remember this

// whenever you use for loop or while loop ...you use i or j right
// DON'T MODIFY OR CHANGE THAT i OR j VARIABLE INSIDE THE LOOP 
// IF YOU ARE USING THAT i OR j ....just use it don't ever modify it 
// Bec if you do so....if you do i++ or j++ you get different value not the  consecutive value

//when leetcode says you Time limit exceed ...when you do some logic error and there exist a infinite loop ...at that time ...it shows TLE...mind it ...soo correct the logic mistake
// Also can be written like this...we are using using valid to just say audience or reader that we found 0. and we are writing break
// and using that valid variable forward in code and writing condition in such a way the condition should be 0 entire code doesn't work and go for next iteration

//if you want to use the collections in your code.....you out import java.util.*; outside the class solution 

//LOGIC pattern
//you have given an integer...you need to return two numbers which sum up to give that integer
// loop till n from 1....i=1;i<=n;i++
// a=i;
// b=n-i;

//we use this kind of thing in our code....sikkudre break aagu
//if found==true 
//break

// if(str.charAt(i)-'0'== x)
// observe this line of code...
// str.charAt(i)=character
// '0'= character zero
// x=integer
// why we are doing substraction from zero??
// if character is there..then internally there will be unicodes..that unicodes gets substracted and resultant is going to be integer
// Ex. '5'-'0'=5(integer)
// now we can easily comapre this integer with x 

// ALWAYS WHEN DEALING WITH CHARACTER OF A STRING HAVE A UNICODES IN MIND AND SUBSTRACTION

*******************************REMEMBER REMEMBER REMEMBER***********************************
when you are dealing with something like i*i pls remember there might be a overflow...soo in that conditions instead of int try to use long
