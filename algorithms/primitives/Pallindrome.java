package algorithms.primitives;

import java.util.ArrayList;
import java.util.List;

/**
 * Check if an integer is a palindrome
 */
public class Pallindrome{
    public static void main(String[] args)
    {
        boolean b = approach1(1331);
        System.out.println(b);
    }

    private static boolean approach1(int num){
        //Extract the digits of num to a list
        List<Integer> digitList = new ArrayList();
        while(num > 0){
            digitList.add(num % 10);
            num/=10;
        }
        //Place pointers i and j on both ends of the list and iterate them forward and backward till the half size of list
        int size = digitList.size();
        for(int i = 0, j = size - 1; i < size/2 && j > size/2; i++, j--){
            if(digitList.get(i) != digitList.get(j)){
                return false;
            }
        }
        return true;
        //If digits at one pointer not equal to another -> not pallindrome. If loop completed then pallindrome.
    }

	private static boolean approach2(int num) {
        //Find first digit
        int digits = (int) Math.ceil(Math.log10(num));
        int k = (int) Math.pow(10, digits - 1);
        for(int i = 0; i<digits/2; i++){
            int firstDigit = num/k;
            //Find last digit
            int lastDigit = num%10;
            //Compare first and last digit
            if(firstDigit != lastDigit) {
                return false;
            }

        //cut first and last digit from number
        num%=k;
        num/=10;
        k/=100;
        }
        return true;
    }
}