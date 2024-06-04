class Solution {
    // Sorts the array using quick sort algorithm
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    // Recursively sorts the array using quick sort
    public void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            // Partition the array and recursively sort the subarrays
            int partitionIndex = partition(nums, start, end);
            quickSort(nums, start, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, end);
        }
    }

    // Partitions the array around a pivot element
    public int partition(int[] nums, int start, int end) {
        // Choose the middle element as the pivot
        int pivot = start + (end - start) / 2;
        // Move the pivot to the end and swap it with the last element
        swap(nums, pivot, end); 

        int left = start;
        int right = end - 1; // since end is pivot

        // Partition the array around the pivot
        while (left <= right) {
            // Move the left pointer to the right until it finds an element greater than the pivot
            while (left <= right && nums[left] < nums[end]) {
                left++;
            }
            // Move the right pointer to the left until it finds an element less than the pivot
            while (left <= right && nums[right] > nums[end]) {
                right--;
            }

            if (left <= right) {
                // Swap the elements at the left and right pointers
                swap(nums, left, right);
                left++;
                right--;
            }
        }

        //The right pointer has the last lowest value which is less than the pivot
        //The left pointer has the first highest value which is greater than pivot, hence swap it with pivot (end)
        swap(nums, left, end); 

        //Return left pointer since it is the parition index where the pivot is currently present
        //All the elements to the left of pivot are less than the pivot and all the elements to the right of pivot are greater than the pivot
        return left;
    }

    // Swaps two elements in the array
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
