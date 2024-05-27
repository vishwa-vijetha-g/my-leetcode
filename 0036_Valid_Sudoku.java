class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;

        //check rows
        for(int i=0;i<n;i++){
            ArrayList<Character> rowElements = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    rowElements.add(board[i][j]);
                }
            }
            if(!checkRow(rowElements)){
                return false;
            }
        }

        //check cols
        for(int i=0;i<n;i++){
            ArrayList<Character> colElements = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(board[j][i]!='.'){
                    colElements.add(board[j][i]);
                }
            }
            if(!checkCol(colElements)){
                return false;
            }
        }

        //check sqs
        for(int i=0;i<7;i=i+3){
            for(int j=0;j<7;j=j+3){
                if(!checkSq(populateSq(i,i+3,j,j+3,board))){
                    return false;
                }
            }
        }
        
        return true;

    }

    public boolean checkRow(ArrayList<Character> row){
        HashSet<Character> hsr = new HashSet<>();
        for(char num:row){
            hsr.add(num);
        }

        return hsr.size()==row.size();
    }

    public boolean checkCol(ArrayList<Character> col){
        HashSet<Character> hsc = new HashSet<>();
        for(char num:col){
            hsc.add(num);
        }

        return hsc.size()==col.size();
    }
    
    public boolean checkSq(ArrayList<Character> sq){
        HashSet<Character> hss = new HashSet<>();
        for(char num:sq){
            hss.add(num);
        }

        return hss.size()==sq.size();
    }
    public ArrayList<Character> populateSq(int rs, int re, int cs, int ce, char[][] board){
        ArrayList<Character> ans = new ArrayList<>();
        for(int i=rs;i<re;i++){
            for(int j=cs;j<ce;j++){
                if(board[i][j]!='.'){
                    ans.add(board[i][j]);
                }
            }
        }

        return ans;

    }

    
}