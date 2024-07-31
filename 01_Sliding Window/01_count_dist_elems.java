// Java program to count distinct elements in every
// window of size K

import java.util.Arrays;

class Test {

    // Counts distinct elements in window of size K
    static int countWindowDistinct(int win[], int K)
    {
        int dist_count = 0;

        // Traverse the window
        for (int i = 0; i < K; i++) {
            // Check if element arr[i] exists in arr[0..i-1]
            int j;
            for (j = 0; j < i; j++)
                if (win[i] == win[j])
                    break;
            if (j == i)
                dist_count++;
        }
        return dist_count;
    }

    // Counts distinct elements in all windows of size K
    static void countDistinct(int arr[], int N, int K)
    {
        // Traverse through every window
        for (int i = 0; i <= N - K; i++)
            System.out.println(countWindowDistinct(
                Arrays.copyOfRange(arr, i, arr.length), K));
    }

    // Driver's code
    public static void main(String args[])
    {
        int arr[] = {1, 2, 1, 3, 4, 2, 3}, K = 4;
        
          // Function call
        countDistinct(arr, arr.length, K);
    }
}
