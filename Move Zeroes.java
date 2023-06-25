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
