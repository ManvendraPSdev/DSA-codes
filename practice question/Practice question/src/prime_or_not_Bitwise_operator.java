
// Find the number is prime or not by the use of bitwise operator 

public class prime_or_not_Bitwise_operator {

    static boolean prime_or_not(int n){
        if(n<=1){
            return false;
        }
        int number =2;
        while(number * number<=n){
            if(n % number == 0){
                return false;
            }
            number ++;
        }
        return true ;
    }
    public static void main(String[] args) {
        int n = 20;
        for(int i=1 ; i<=n ; i++){
                    System.out.println(i + " " + prime_or_not(n));

        }
    }
}
