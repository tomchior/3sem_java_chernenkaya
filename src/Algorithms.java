import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sieveOfEratosthenes(25)));
        System.out.println(Arrays.toString(primes(20)));
    }

    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i < n + 1; i++) {
            if (prime[i]) {
                for (int j = 2 * i; j < n + 1; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }

    static int[] primes(int n) {
        boolean[] prime = sieveOfEratosthenes(n);
        int num = 0;
        for (boolean x : prime)
            if(x)
               num++;
        int[] arr = new int[num];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (prime[i]) {
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
}





