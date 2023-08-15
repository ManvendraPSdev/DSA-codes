// We can do this With the help of Binary Search

public class Finding_SquareRoot_of_Number {

    static double SQRT(int n , int p){
        int s =0;
        int e = n;

        double root = 0.0;
        // First we have to find the integer value (Value before the decimal) of the root for that we do Binary Search

        while(s<=e){
            //finding mid element
            int mid = s + (e - s)/2  ;
            
            if(mid * mid > n){
                e = mid -1;
            }
            else if(mid * mid < n){
                s = mid +1;
            }
            else{
                return mid;
            }
        }

        double incr = 0.1;  // Initialize the increament by 0.1  So that our precision value Keeps on increamenting 
        for(int i=0 ; i<p ; i++){
            while(root*root <= n){
                root += incr;
            }
            root -= incr;   // At One point the value for root 40 will be 6.4 and (6.4 * 6.4 > 40) So because it is greater than 40 we have to go at 6.3 Which is (6.3 * 6.3 < 40) but After Increamenting in it upto Some decimal Places we get the Exact Ans 40 , So since we have to jump from 6.4 to 6.3 we do decrement



            // For increamenting in the Second decimal place 
            incr /= 10;
        }
        return  root ;
    }
    public static void main(String[] args) {
        int n=40 ;
        int p=2 ;    // Here p is the precission means aat What decimal place 

        System.out.println(SQRT(n , p));
    }
}
