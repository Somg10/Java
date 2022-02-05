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
		    int n = sc.nextInt();
		    int pages[] = new int[n];
		    String words[] = new String[n];
		    
		    int pg =sc.nextInt();
		    for(int i = 0 ; i < n; i++)
		     pages[i] = sc.nextInt();
		     
		   for(int i = 0; i < n; i++)
		    words[i] = sc.next();
		    
		   Geeks obj = new Geeks();
		   obj.Dictionary(pages, words, pg);
		}
	}
}



 // } Driver Code Ends
//User function Template for Java

/* Helper class containing function to complete
pages[]: containg n pages
words[]: containing n words
pg: woord specified at this page to be found
*/
class Geeks
{
    
    // print the word corresponding to page 
    // number pg
    @SuppressWarnings("unchecked")
    public static void Dictionary(int pages[], String words[], int pg)
    {
        // Your code here
        int i=0;
        for(i=0;i<pages.length;i++)
        if(pages[i]==pg)
        break;
        
        if(i>=pages.length)
        System.out.println("null");
        else{
            System.out.print(words[i]);
        }
    }
}


// { Driver Code Starts.
  // } Driver Code Ends
