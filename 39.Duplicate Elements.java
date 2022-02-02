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
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)
		     arr[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    obj.SortedDuplicates(arr, n);
		    System.out.println();  // print the newline
		    
		}
	}
}




 // } Driver Code Ends
//User function Template for Java

/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/
class Geeks
{
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> tr = new TreeSet<>();
        for(int i=0; i<arr.length; i++){
            int a=arr[i];
            if(hs.contains(a)==false){
                hs.add(a);
                
            }
            else{
                tr.add(a);
            }
        }
     
        if(tr.size()==0){
            System.out.print("-1");
        }
        else{
            for(int it: tr){
                System.out.print(it+ " ");
            }
        }
    }
    
}
   
