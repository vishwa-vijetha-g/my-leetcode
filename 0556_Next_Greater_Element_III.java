class Solution {
    public int nextGreaterElement(int n) {
        char[] s = String.valueOf(n).toCharArray();
        int len = s.length;

        int index1 = -1;

        for(int i=len-2;i>=0;i--){
            if(s[i] < s[i+1]){
                index1 = i;
                break;
            }
        }

        if(index1==-1) return -1;

        int index2 = 0;

        for(int i=len-1;i>=0;i--){
            if(s[i]> s[index1]){
                index2 = i;
                break;
            }
        }

        char temp = s[index1];
        s[index1] = s[index2];
        s[index2] = temp;

        reverse(s,index1 + 1,len - 1);


        long ans = Long.valueOf(new String(s));

        if(ans>Integer.MAX_VALUE) return -1;
        
        return (int) ans;
    }

    public void reverse(char[] s, int start, int end){
        while(start < end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;

            start++;
            end--;
        }
    }
}