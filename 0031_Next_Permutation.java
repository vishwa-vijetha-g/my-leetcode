class Solution {
    public void nextPermutation(int[] nums) {
        int dip = -1;
        int n = nums.length;

        //finding the dip from end
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                dip = i;
                break;
            }
        }

        //if dip not found it means it is the last permutation
        if(dip==-1){
            reverse(nums,0,n-1);
            return ;
        }

        //find the least highest number of the dip and swap it
        //reverse the remaining part from the dip
        
        for(int i=n-1;i>=dip;i--){
            if(nums[i]>nums[dip]){
                swap(nums,i,dip);
                reverse(nums,dip+1,n-1);
                break;
            }
        }



    }

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}