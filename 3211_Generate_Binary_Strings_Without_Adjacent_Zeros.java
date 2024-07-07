class Solution {
    public List<String> validStrings(int n) {
        int till = (int) Math.pow(2,n);
        List<String> ans = new ArrayList<>();

        for(int i=0;i<till;i++){
            String bin = generateBinary(i,n);
            if(bin!=null)
                ans.add(bin);
        }

        return ans;
    }

    public String generateBinary(int i, int n){
        StringBuilder sb = new StringBuilder();
        while(i>0){
            sb.append(String.valueOf(i%2));
            i = i/2;
        }

        while(sb.length()!=n){
            sb.append("0");
        }

        if(sb.indexOf("00")==-1){
            return sb.reverse().toString();
        }else{
            return null;
        }
    }
}