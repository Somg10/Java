// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // take testcases
        int t = sc.nextInt();
        while (t-- > 0) {
            // taking the number
            int n = sc.nextInt();
            Geeks obj = new Geeks();

            // caling isPrime method
            // with n as argument
            obj.isPrime(n);
        }
    }
}

// Position this line where user code will be pasted.
// } Driver Code Ends


// User function Template for Java

class Geeks {
    static void isPrime(int n) {
        int i = 0;
        for (i = 2; i <= n-1; i++) {
            // Your code here
            if(n%i==0){
                break;
            }
        }
        if(i==n){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        
        }
            
        

        System.out.println();
    }
}
