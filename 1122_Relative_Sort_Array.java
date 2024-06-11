class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;

        int insert = 0;
        for(int i=0;i<a2;i++){
            for(int j=0;j<a1;j++){
                if(arr1[j]==arr2[i]){
                    swap(arr1,j,insert);
                    insert++;
                }
            }
        }

        sort(arr1,insert,a1);
        return arr1;

    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public void sort(int[] arr, int start, int end){
        for(int i=end-1;i>=start;i--){
            for(int j=start;j<i;j++){
                if(arr[j]>arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }
}