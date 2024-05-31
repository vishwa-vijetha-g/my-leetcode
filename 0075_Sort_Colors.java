class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        boolean swapped = false;
        for(int i=n-1;i>=0;i--){
            swapped = false;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j]= temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }

        //check out dutch national flag algo
    }
}