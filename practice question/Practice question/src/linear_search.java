import java.util.*;
public class linear_search {
    static int search(int arr[] , int target ){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target ){
                return i ; 
            }
            else if(arr.length == 0){
                return -1;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements in an array");
        for(int i=0 ; i<= arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element ");
        int target = sc.nextInt();
        System.out.println("Index of searched Element");
        System.out.println(search(arr , target));
    }
}
