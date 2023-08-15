
import java.util.*;
public class max_min_number {
    static int max_num(int num1 , int num2 , int num3){
         if(num1>num2 & num1>num3){
            return(num1);
        }
        else if(num2>num1 & num2>num3){
           return (num2);
        }
        else if(num3>num1 & num3>num2){
            return (num3);
        }
        else{
            System.out.println("All numbers are equal");
        
        }
        return 0 ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int ans = max_num(num1, num2, num3);
        System.out.println("Maximum number is "+ ans );
    }
}
