import java.util.HashSet;

public class q5 {
    public static boolean isValidSudoku(char[][] board) {
         HashSet<String> h =new HashSet<>();
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == '.') continue;
                String row = board[i][j] + " in row " + i;
                String col = board[i][j] + " in col " + j;
                String pos = board[i][j] + " in " + i/3 +"-"+j/3;

                if(!h.add(row) || !h.add(col) || !h.add(pos)){
                    return false;
                }
            }
         }
         return true;
    }
    public static void main(String[] args) {
        
    }
}
