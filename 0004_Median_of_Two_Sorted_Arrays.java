class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] nums = new int[n1+n2];
        int n = n1 + n2;

        int a = 0;
        int b = 0;
        int c = 0;

        while(c<(n/2)+1){
            if(a<n1 && b<n2){
                if(nums1[a]<=nums2[b]){
                    nums[c] = nums1[a];
                    a++;
                }else{
                    nums[c] = nums2[b];
                    b++;
                }
            }else if(a<n1){
                nums[c] = nums1[a];
                a++;
            }else if(b<n2){
                nums[c] = nums2[b];
                b++;
            }
            c++;
        }

        double ans;

        if(n%2==1){
            ans = (nums[n/2]) / 1.0;
        }else{
            ans = (nums[(n/2) - 1] + nums[n/2]) / 2.0;
        }

        return ans;

        
    }
}