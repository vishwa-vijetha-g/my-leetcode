class Solution {
    public int maxArea(int[] height) {
        int h = height.length;

        int left = 0;
        int right = h-1;

        int currArea = Integer.MIN_VALUE, maxiArea = Integer.MIN_VALUE;

        while(left<right){
            maxiArea = (int) Math.max(maxiArea,  ((int) Math.min(height[left],height[right])) * (right - left));

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxiArea;
    }
}