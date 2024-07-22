class Solution {
    int countTriplet(int arr[], int n) {
        // Sort the array
        Arrays.sort(arr);
        int count = 0;
        // Iterate through the array from the last element to the third element
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == arr[i]) {
                    count++;
                    left++;
                    right--;
                } else if (sum < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
