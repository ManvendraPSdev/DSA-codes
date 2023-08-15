import java.util.*;
public class even_odd {
    static String  odd_even(int num){
        if (num%2==0){
            return ("Even !");
        }
        else{
            return("Odd!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(odd_even(num));
    }
}
