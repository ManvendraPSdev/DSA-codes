import java.util.*;
public class Func_return_sum_n_natural_number {
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        else{
            return(sum(n-1)+n);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    
}
