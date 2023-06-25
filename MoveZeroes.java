/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
a. 1 <= nums.length <= 10^4
b. -2^31 <= nums[i] <= 2^31 - 1
*/


public void moveZeroes(int[] nums) {
    int slow = 0; // pointer to place the next non-zero element
    int fast = 0; // pointer to iterate through the array

    // Move all non-zero elements to the beginning of the array
    while (fast < nums.length) {
        if (nums[fast] != 0) {
            // Swap non-zero element with the current slow pointer
            int temp = nums[slow];
            nums[slow] = nums[fast];
            nums[fast] = temp;
            slow++; // Increment the slow pointer
        }
        fast++; // Increment the fast pointer
    }

    // Set all elements after the slow pointer to zero
    for (int i = slow; i < nums.length; i++) {
        nums[i] = 0;
    }
}
