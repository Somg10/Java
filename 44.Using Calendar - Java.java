// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    int n;
		    int d,m,y;
		    n=sc.nextInt();
		    d=sc.nextInt();
		    m=sc.nextInt();
		    y=sc.nextInt();
		    Geeks obj = new Geeks();
		    obj.timeBeforeAfterNdays(d,m,y,n);
		}
		
	}
}




 // } Driver Code Ends
//User function Template for Java

class Geeks
{
    public static void timeBeforeAfterNdays(int d,int m,int y,int n)
    {
      //Your code here
      Calendar cl = Calendar.getInstance();
        cl.set(y, m-1, d);
        cl.add(Calendar.DATE, n);
        System.out.println("day after n days: " + cl.get(Calendar.DAY_OF_WEEK));
    }
    
}

// { Driver Code Starts.
  // } Driver Code Ends
