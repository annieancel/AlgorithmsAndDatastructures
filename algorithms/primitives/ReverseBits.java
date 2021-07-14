package algorithms.primitives;

/**
 * Given an input integer input, return the integer value of input's bits reversed.
 * You will only be reversing the "significant portion" of the binary representation 
 * (ignoring leading zeros).
 * 
 * Example:
 * Input: 1
 * Output: 1
 * Explanation: Under 8 bits 1 can be represented as 00000001. If we only reverse the 
 * significant protion of this we yield 00000001 which is 1 in binary.
 */
public class ReverseBits {
    public static void main(String[] args)
    {

        System.out.println(reverse(4));
    }

    private static int reverse(int input){
    /*
     * Approach:
     *   1. Check the last bit of input
     *   2. Shift output left
     *   3. If it is 1, add it to output (do nothing otherwise)
     *   4. Shift input right
     *
     * Stop when input is 0
     */
        int output = 0;
        while(input != 0){
            output = output<<1;
            if((input&1) == 1) {
                output = output | 1;
            }
            input = input>>1;
        }
        return output;
    }
}
