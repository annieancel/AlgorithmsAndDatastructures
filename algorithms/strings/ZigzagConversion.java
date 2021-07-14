package algorithms.strings;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(zigzag("REDBLUEBLACK", 3));
    }
    public static String zigzag(String s, int rows) {
        if(rows == 1){
          return s;
        }
        List<List<Character>> result = new ArrayList<>();
        for(int i = 0;i<rows;i++){
          result.add(new ArrayList());
        }
        int i = 0;
        while(i<s.length()){
          for(int j =0;j<rows;j++){
            System.out.println("i="+i + " j="+j);
            result.get(j).add(s.charAt(i++));
          }

          for(int j = rows-2;j>=1 && i<s.length();j--){
            System.out.println("i="+i + " j="+j);
            result.get(j).add(s.charAt(i++));
          }
        }
        StringBuilder sb = new StringBuilder();
        for(List<Character> list:result){
          for(Character c:list){
            sb.append(c);
          }
        }
        return sb.toString();
      }
}
