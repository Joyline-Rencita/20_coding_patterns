class Main { 
    static int countWindowDistinct(int win[], int K) {                         // Counts distinct elements in a window of size K
        int dist_count = 0;                                                          // Initialize the count of distinct elements
                                                                                     // Traverse the window
        for (int i = 0; i < K; i++) {                                                            // Loop through each element in the window
            int j;                                                                               // Variable to check for duplicates
            for (j = 0; j < i; j++) {                                                                    // Check if element win[i] exists in win[0..i-1]
                if (win[i] == win[j])                                                                    // If a duplicate is found
                    break;                                                                               // Exit the inner loop
            }
            if (j == i)                                                                              // If no duplicate is found
                dist_count++;                                                                        // Increment the count of distinct elements
        }
        return dist_count;                                                                           // Return the count of distinct elements in the window
    }

    static void countDistinct(int arr[], int N, int K) {                        // Counts distinct elements in all windows of size K
        for (int i = 0; i <= N - K; i++) {                                            // Traverse through every window
            int[] window = Arrays.copyOfRange(arr, i, i + K);                                     // Create a subarray for the current window
            System.out.println(countWindowDistinct(window, K));                                   // Count and print distinct elements in the current window
        }
    }
 public static void main(String args[]) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3}; 
        int K = 4;                                                    // Size of the window
        countDistinct(arr, arr.length, K);                            // Call the function to count distinct elements in each window
    }
}
