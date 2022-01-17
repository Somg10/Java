// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	  int n=sc.nextInt();
    	  int arr[]=new int[n];
    	  for(int i=0;i<n;i++)
    	  {
    	      arr[i]=sc.nextInt();
    	  }
    	  Geeks obj=new Geeks();
    	   System.out.println(obj.countSumSubsets(arr,n));
    	   
    	 }
    }
}


 // } Driver Code Ends
//User function Template for Java


class Geeks{
    
    static int countSumSubsets(int arr[],int n)
    {
        
        //Your code here
        int sl = (int)Math.pow(2,n);
        int count = 0;
        
        for(int i = 1; i < sl; i++) {
            int sum = 0;
            for(int j = 0 ; j < n; j++) {
                if((i & (1 << j)) == 1) {
                    sum += arr[j];
                }
            }
            if(sum%2 == 0) {
                count++;
            }
        }
        
        return count;
        
    }
}

// { Driver Code Starts.
  // } Driver Code Ends
