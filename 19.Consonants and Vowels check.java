// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	    //taking input using class Scanner
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking total count of all testcases
    	 int t = sc.nextInt();
    	 sc.nextLine();
    	 boolean flag = false;
    	 while(t-- > 0){
    	  
    	  //taking the input String
    	  String s=sc.nextLine();
    	  
    	  //Creating an object of class Geeks
    	  Geeks obj=new Geeks();
    	  
    	  //calling the checkString
    	  //method of class Geeks
    	  obj.checkString(s);
    	   
    	 }
    }
}// } Driver Code Ends


//User function Template for Java



class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        int n = s.length();
        for(int i = 0;i<n;i++){
            char vb = s.charAt(i);
            if(vb=='a'||vb=='e'||vb=='i'||vb=='o'||vb=='u'){
                v++;
            }
            else if(vb==' '){
                continue;
            }
            else{
                c++;
            }
        }
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}

//Position this line where user code will be pasted.
