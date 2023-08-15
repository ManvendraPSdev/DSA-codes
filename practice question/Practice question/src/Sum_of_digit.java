import java.util.*;
public class Sum_of_digit {
    static int digit(int n){
        if(n==0){
            return 0;
        }
        else {
            return (n%10 + digit(n/10));
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = sc.nextInt();   
     System.out.println(digit(n));
    }
    
}
