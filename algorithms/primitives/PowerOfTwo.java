package algorithms.primitives;

/**
 * Given a non-negative integer input, return true if input is a power of two. 
 * Return false otherwise.
 */
public class PowerOfTwo{
    public static void main(String[] args)
    {
        boolean b = approach1(16);
        System.out.println(b);
    }
    
    //Find log base 2 of num. If log base 2 is not a decimal, then it is a power of 2.
    private static boolean approach1(int num){
         double log = Math.log(num)/Math.log(2);
         if(Math.floor(log) == Math.ceil(log)){
             return true;
         }
         return false;
     }

    private static boolean approach2(int num){
            if(num > 0){
                if((num & num-1) == 0){
                    return true;
                }
            }
            return false;
        }
}