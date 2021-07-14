package algorithms.primitives;

/**
 * Given two strings s1 and s2 consisting of digits between 0 to 9, 
 * return a string representing the sum of s1 and s2 when they are considered 
 * as base-10 decimal numbers.
 */
public class AddStrings {
    public String add(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
    
        StringBuffer result = new StringBuffer();
        while(i >=0 || j>=0){
          int d1 = 0, d2 = 0;
          if(i >= 0){
            d1 = s1.charAt(i) - '0';
          }
          if(j >= 0){
            d2 = s2.charAt(j) - '0';
          }
          int sum = d1 + d2 +carry;
          result.append(sum%10);
          carry = sum/10;
          i--;
          j--; 
        }
        if(carry != 0){
          result.append(carry);
        }
        return result.reverse().toString();
        }
}
