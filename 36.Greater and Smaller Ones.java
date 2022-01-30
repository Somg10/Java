// { Driver Code Starts
//Initial Template for Java

import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Geeks
{
    // Function to find elements greater than or equal to K
    public static void greaterKSorted(int arr[], int k)
    {
        // Your code here
        Arrays.sort(arr);
        int flag=1;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=k && ans!=arr[i]){
                ans=arr[i];
                System.out.print(ans+" ");
                flag++;
            }
        }
        if(flag==1){
            System.out.print("-1");
        }
        
    }
    
    // Function to find element less than K
    public static void smallerKSorted(int arr[], int k)
    {
        // Your code here
        Arrays.sort(arr);
        int flag=1;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k && ans!=arr[i]){
                ans=arr[i];
                System.out.print(arr[i]+" ");
                flag++;
            }
        }
        if(flag==1){
            System.out.print("-1");
        }
        
    }
}

// { Driver Code Starts.

// Driver class
class GFG 
{
    // Driver code
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		// Iterating over testcases
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)
		      arr[i] = sc.nextInt();
		      
		    Geeks obj = new Geeks();
		    obj.greaterKSorted(arr, k);
		    System.out.println();
		    obj.smallerKSorted(arr, k);
		    System.out.println();
		    //System.out.println("~");
		}
	}
}  // } Driver Code Ends
