You are given an integer array nums and two integers minK and maxK. A fixed-bound subarray of nums is a subarray that satisfies the following conditions:
The minimum value in the subarray is equal to minK. The maximum value in the subarray is equal to maxK. Return the number of fixed-bound subarrays. A subarray is a contiguous part of an array.

Example 1:
Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5          Output: 2             Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].

Example 2:
Input: nums = [1,1,1,1], minK = 1, maxK = 1              Output: 10             Explanation: Every subarray of nums is a fixed-bound subarray. There are 10 possible subarrays.

Constraints:
2 <= nums.length <= 105 ,       1 <= nums[i], minK, maxK <= 106

CODE :

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;                                                  // Initialize the count of valid subarrays to 0
        int j1 = -1, j2 = -1, k = -1;                                  // Initialize indices for tracking positions
        
        for (int i = 0; i < nums.length; ++i) {                                           // Loop through each element in the array
            if (nums[i] < minK || nums[i] > maxK) {                                       // If the current element is out of the valid range [minK, maxK]
                k = i;                                                                    // Update k to the current index i
            }
            if (nums[i] == minK) {                                                                // If the current element is equal to minK
                j1 = i;                                                                           // Update j1 to the current index i
            }
            if (nums[i] == maxK) {                                                           // If the current element is equal to maxK
                j2 = i;                                                                      // Update j2 to the current index i
            }
            ans += Math.max(0, Math.min(j1, j2) - k);                            // Calculate the number of valid subarrays ending at index i
        }
        return ans;                                               // Return the total count of valid subarrays
    }
}
