
// Finding the prime number with the help of (sieve of Eratosthenes)

public class sieve_of_Eratosthenes {

    static void sieve(int n , boolean prime[]){
        for(int i=2 ; i*i <= n ; i++){

            // False in array means Number is prime 
            if(prime[i] == false){

                // False means that the number is prime 
                // true means that the number is visited 
                //( So numbers Which are false , Now We have to make all the multiple of that number true )
                 
                for(int j=i*2 ; j<= n ; j+=i){
//                     In the line `for(int j=i*2 ; j<= n ; j+=i)`, we start marking the multiples of the current prime number `i` as composite (not prime). The reason we start at `i*2` is that the number `i` itself is a prime number, and we don't want to mark it as composite.

// When using the Sieve of Eratosthenes algorithm, we start with the first prime number, which is 2, and then mark all its multiples starting from `2 * 2 = 4`. If we started marking from `2 * 1 = 2`, we would end up marking the number 2 as a composite number, which is incorrect because 2 is indeed a prime number.

// Similarly, when we move to the next prime number, we will start marking its multiples from `3 * 2 = 6`, again skipping the prime number 3. This process continues for each prime number we encounter while iterating through the numbers up to the square root of `n`.

// In summary, we start marking the multiples of a prime number from `i * 2` to avoid marking the prime number itself as composite and then continue marking its subsequent multiples. This ensures that we correctly find all prime numbers up to the given limit `n` using the Sieve of Eratosthenes algorithm.


                    prime[j] = true;
                }
            }
        }

        for(int i=2 ; i<= n ; i++){
            if(prime[i] == false){
                System.out.println(i+ " ");

            }
        }
    }

    public static void main(String[] args) {
        int n = 40;
        boolean prime[] = new boolean[n+1];   // Beacuse we have to include 40 also this is Why we use n+1
        sieve(n , prime);
    }
}