package algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public static void main(String[] args) {
        int[][] board = {{5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}};
        System.out.println(isValid(board));
    }

    private static boolean isValid(int[][] board) {
        int n = board.length;
        //Rows
        for(int i = 0;i<n;i++){
          Map<Integer, Boolean> elements = new HashMap<>();
          for(int j=0;j<n;j++){
            if(board[i][j] != 0){
              if(elements.get(board[i][j]) != null){
                return false;
              }
              elements.put(board[i][j], true);
            }
          }
        }
         
        //Columns
        for(int i = 0;i<n;i++){
          Map<Integer, Boolean> elements = new HashMap<>();
          for(int j=0;j<n;j++){
            if(board[j][i] != 0){
              if(elements.get(board[j][i]) != null){
                return false;
              }
              elements.put(board[j][i], true);
            }
          }
        }
    
        //subgrid
        Map<String, Map<Integer,Boolean>> gridElements = new HashMap<>();
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            StringBuilder sb = new StringBuilder();
            sb.append(i/3).append(j/3);
            String subgrid = sb.toString();
            Map<Integer, Boolean> elements = gridElements.get(subgrid);
            if(null == elements){
              elements = new HashMap<>();
              gridElements.put(subgrid, elements);
            }
            if(board[i][j] != 0){
              if(elements.get(board[i][j]) != null){
                return false;
              }
              elements.put(board[i][j], true);
            }
          }
        }
        return true;
      }
}
