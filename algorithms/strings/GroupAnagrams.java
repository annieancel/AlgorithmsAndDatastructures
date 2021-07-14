package algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams{
    public static void main(String[] args) {
        System.out.println(groupAnagrams(Arrays.asList("eat","bat","ate","tab","tea","eat")));
    }

    private static List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String word:words){
          String sortedWord = sortWord(word);
          List<String> anagramList = anagrams.getOrDefault(sortedWord, new ArrayList<>());
          if(anagramList.isEmpty()){
            anagrams.put(sortedWord, anagramList);
          }
          anagramList.add(word);
        }
        return new ArrayList(anagrams.values());
      }
    
      private static String sortWord(String word){
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<arr.length;i++){
          sb.append(arr[i]);
        }
        return sb.toString();
      }
}