package algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class EnumeratePrimes {
    public static void main(String[] args) {
        System.out.println(enumeratePrimes(23));
    }

    public static List<Integer> enumeratePrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i=0;i<n;i++){
          isPrime[i] = true;
        }
        for(int i=2;i*i<n;i++){
          if(isPrime[i] == true){
            for(int j = i*i;j<n;j+=i){
              isPrime[j] = false;
            }
          }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i = 2;i<n;i++){
          if(isPrime[i]){
            primes.add(i);
          }
        }
        return primes;
      }
}
