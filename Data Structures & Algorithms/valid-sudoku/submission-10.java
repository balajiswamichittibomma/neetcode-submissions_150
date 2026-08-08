class Solution {
    boolean douplicates(char[] s){
        int[] count = new int[9];
        for (char i : s){
            if (i !='.'){
                int ind = i-'0';
                
                count[ind-1]++;
            }
        }
       // System.out.println(Arrays.toString(count));
        for (int i : count){
            if (i > 1){
              //  System.out.println(i);
                return true;
            }
        }
    return false;
    }




    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            char[] row = new char[9];
            char[] col = new char[9];
            for (int j = 0; j < 9; j++) {
                row[j] = board[i][j];
                col[j] = board[j][i];
            }
            if (douplicates(row) || douplicates(col)) return false;
        }

        for (int l  = 0; l < 9;l+= 3)  {
             
        for (int k = 0; k < 9;k+=3){
           char[] num = new char[9];
            int cou = 0;
             for ( int i =  l; i < l+3;i++){
                for ( int j =  k; j < k+3;j++){
                    num[cou++] = board[i][j];
                  //  System.out.print("( "+i+" , "+j+" ) ");
                
             }
            // System.out.println();
             }
             // System.out.println(Arrays.toString(num));
             // System.out.println(douplicates(num));
              if (douplicates(num))return  false;
             
        }
        }  
        return true;
    }

}