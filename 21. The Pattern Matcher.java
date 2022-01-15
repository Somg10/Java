// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks obj=new Geeks();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}


 // } Driver Code Ends
//User function Template for Java



class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        int countx=0;
       int flag =0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='x'){
               if(flag==1 && countx!=0){
                   break;
               } else {
                   countx++;
                   flag =0;
               }
               
           } else if(s.charAt(i)=='y'){
               flag =1;
               countx--;
           }
       }
       
      if(countx!=0){
          System.out.println(0); 
      } else {
     System.out.println(1);
      }
   }
}


// { Driver Code Starts.
  // } Driver Code Ends
