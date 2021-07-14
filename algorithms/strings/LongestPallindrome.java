package algorithms.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPallindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabcdefgh"));
    }

    private static int longestPalindrome(String s) {
        Map<Character, Integer> repeatedCharMap = new HashMap<>();
    for(int i = 0;i<s.length();i++){
      char character = s.charAt(i);
      if(repeatedCharMap.get(character) != null){
        int count = repeatedCharMap.get(character);
        repeatedCharMap.put(character, ++count);
      }
      else{
        repeatedCharMap.put(character, 1);
      }
    }
    int repeatedCharCount = 0;
    for(Character character:repeatedCharMap.keySet()){
      int charCount = repeatedCharMap.get(character);
      if(charCount%2 == 0){
        repeatedCharCount+=charCount;
      }
      else{
        repeatedCharCount+=charCount-1;
      }
    }
    if(s.length() > repeatedCharCount){
      return repeatedCharCount+1;
    }
    return repeatedCharCount;
      }
}
