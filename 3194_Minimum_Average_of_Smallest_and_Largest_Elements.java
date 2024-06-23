class Solution {
    public double minimumAverage(int[] nums) {
        
        //sort the array
        Arrays.sort(nums);

        //initialize left and right pointers at the extreme edges
        //so that they point at minimum and maximum numbers respectively
        int left = 0;
        int right = nums.length - 1;

        //initialize ans with maximum possible value since we are trying to obtain the minimum value
        double ans = Double.MAX_VALUE;

        //loop until both the pointers reach the middle of the array, meaning all the elements are covered
        while(left<right){
            
            //find the average between the elements at left and right pointers, i.e, minimum and maximum numbers
            ans = ans = Math.min(ans, (nums[left]+nums[right])/2.0);
            
            //increment the left pointer to point the next minimum
            left++;
            
            //decrement the right pointer to point the next maximum
            right--;
        }

        //return the answer
        return ans; 
    }
}
