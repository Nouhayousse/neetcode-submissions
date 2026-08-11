public class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] rows=new HashSet[9];
        Set<Character>[] cols=new HashSet[9];
        Set<Character>[] boxes=new HashSet[9];

        for(int i=0;i<9;i++) {
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char v=board[i][j];
                if(v=='.') continue;
                else{
                    int num_sb=i/3 * 3 + j/3 ;
                    if(!rows[i].contains(v) & !cols[j].contains(v)
                    & !boxes[num_sb].contains(v)){
                     rows[i].add(v);
                     cols[j].add(v);
                     boxes[num_sb].add(v);
                        }
                    else return false;
                }    
            }

            
        }
        return true;
    }    
        
        
}