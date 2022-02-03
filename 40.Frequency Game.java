// { Driver Code Starts
// Initial Template for Java

import java.util.*;

// Position this line where user code will be pasted.

// Driver class with main function
class GFG {
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // Iterating over testcases
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Geeks obj = new Geeks();
            System.out.println(obj.LargButMinFreq(arr, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

// Helper class to find largest number with minimum frequency
class Geeks {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        Arrays.sort(arr);
        HashMap<Integer, Integer> hma = new HashMap<Integer, Integer>();
        for (int a : arr) {
            if (hma.containsKey(a)) {
                hma.put(a, hma.get(a)+1);
            } else {
                hma.put(a, 1);
            }
        }
        int res = arr[n-1];
        int freq = hma.get(res);
        for (Map.Entry<Integer, Integer> entry : hma.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (key<res && val<freq) {
                res = entry.getKey();
                freq = entry.getValue();
            }
        }
        return res;
    }
}
