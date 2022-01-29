// { Driver Code Starts
//Initial Template for Java

import java.util.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n1 = sc.nextInt();
		    int n2 = sc.nextInt();
		    int arr1[] = new int[n1];
		    int arr2[] = new int[n2];
		    for(int i = 0; i < n1; i++)
		     arr1[i] = sc.nextInt();
		     
		    for(int i = 0; i < n2; i++)
		     arr2[i] = sc.nextInt();
		    
		    
		    
		    Geeks obj = new Geeks();
		    System.out.println(obj.commonSum(arr1, arr2));
		}
	}
}




 // } Driver Code Ends
//User function Template for Java

class Geeks
{
    public static long commonSum(int arr1[], int arr2[])
    {
       //Your code here
       int sum = 0;
       Set<Integer> set = new HashSet<>();
       for(int i: arr1){
           set.add(i);
       }
       for(int i: arr2){
           if(set.contains(i)){
               sum+=i;
               set.remove(i);
           }
       }
       return sum;
    }
}

// { Driver Code Starts.
  // } Driver Code Ends
