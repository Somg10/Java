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
		    int n = sc.nextInt();
		    String party[] = new String[n];
		    int seats[] = new int[n];
		    for(int i = 0; i < n; i++)
		     party[i] = sc.next();
		     
		    for(int i = 0; i < n; i++)
		     seats[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    obj.Election2019(party, seats, n);
		    
		}
	}
}





 // } Driver Code Ends
//User function Template for Java

// Helper class containing function Election2019
class Geeks
{
    
    /* print the name of the parties along with seats
       they got in election and print the maximum seat
       received
    */
    public static void Election2019(String party[], int seats[], int n)
    {
        //Your code here
        int m = 0;
        Map<String,Integer> mp = new TreeMap<>();
        for(int i=0;i<n;i++){
            mp.put(party[i],seats[i]);
        }
        for(int e:mp.values()){
            if(e>m){
                m=e;
            }
        }
        for(Map.Entry<String,Integer> a:mp.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
        
        System.out.println(m);
    }
}

   

// { Driver Code Starts.
  // } Driver Code Ends
