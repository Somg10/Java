// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking total number of testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the 2 strings
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   
    	   //creating an object of class Geeks
    	   Geeks obj=new Geeks();
    	   
    	   //calling coutChars method
    	   //of class Geeks and passing
    	   //both the Strings and printing
    	   //the result
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }
}




 // } Driver Code Ends
//User function Template for Java

/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks{
    
    static int coutChars(String s1, String s2)
    {
        
       //Your code here
       int arr[] = new int[256];
       for(int i=0;i<s1.length();i++)
       {
           arr[s1.charAt(i)]++;
       }
       for(int i=0;i<s2.length();i++)
       {
           arr[s2.charAt(i)]--;
       }
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>0 || arr[i]<0)
           {
               count+=Math.abs(arr[i]);
           }
       }
       return count;
    }
}

// { Driver Code Starts.
  // } Driver Code Ends
