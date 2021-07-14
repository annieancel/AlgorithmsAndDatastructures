package algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueCharacterSubstring {
    public static void main(String[] args) {
        System.out.println(getLongestUniqueCharacterSubstringCount("ABCDEJDGOHSUHUSDZHFIHDZNNNDWIOWEROIPURWTIOWRUBCQOPCJDBKJHDSHGUGJNMACDKOKPPOWOEIRIWUEUWRIUGHNCJMXALJK"));
    }

    public static int getLongestUniqueCharacterSubstringCount(String s){
        Map<Character, Boolean> charMap = new HashMap<>();
    int count=0, largestCount = 0;
    for(int i=1;i<s.length();i++){
      char c = s.charAt(i);
      if(null!=charMap.get(c)){
        if(count>largestCount){
            largestCount = count;
          }
        charMap.clear();
        count = 0;
      }
      charMap.put(c,true);
      count++;
    }
    if(count>largestCount){
      largestCount = count;
    }
    return largestCount;
    }
}
