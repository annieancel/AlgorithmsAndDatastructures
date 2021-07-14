package algorithms.strings;

public class AddBinaryStrings {
    public static void main(String[] args) {
        System.out.println(addBinaryStrings("101", "1"));
    }
    public static String addBinaryStrings(String s1, String s2) {
        StringBuffer result = new StringBuffer();
        int carry = 0;
        for(int i=s1.length()-1,j=s2.length()-1; i>=0||j>=0;i--,j--){
          int d1=0, d2=0, sum = 0;
          if(i>=0){
            d1 = s1.charAt(i) - '0';
          }
          if(j>=0){
            d2 = s2.charAt(j) - '0';
          }
          sum+=d1+d2+carry;
          result.append(sum%2);
          carry = sum/2;
        }
        if(carry != 0){
          result.append(carry);
        }
        return result.reverse().toString();
      }
}
