public class factor_of_Number_DSA {

    // Time Complexity O(n)
    static void factor1(int n){   // Brute force Approch 
        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        
    }

    // Time Complexity O(sqrt(n))
    static void factor2(int n){    // Optimized Approach
        for(int i=1 ; i<= Math.sqrt(n) ; i++){
            if(n % i ==0 ){
                System.out.println(i +" "+ n/i);   // Here we printing i and n/i (n/i because if we do 20%2 then i=2 and n/i = 10 Since Both are the Answers Therefore We are printing both )
            }
        }
    }
    public static void main(String[] args) {
        int n = 36 ;
        factor1(n);
        factor2(n);
    }
}
