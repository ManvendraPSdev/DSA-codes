import java.util.*;
public class Swap {
    static void swap(int arr[] , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        int arr[] = {23,45,667,86,23,11,12};
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 1");
        int index1 = sc.nextInt();
        System.out.println("Enter 2");
        int index2 = sc.nextInt();
        swap(arr , index1 ,index2);
    }
}
// For swapping into an Array we need the indices(index)

    // static void swap(int arr[] , int index1 , int index2 ){
    //     int temp = arr[index1];
    //     arr[index1] = arr[index2];
    //     arr[index2] = temp ; 
    //     System.out.println(Arrays.toString(arr)); 
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,34,56,78,9};
    //     Scanner sc = new Scanner(System.in);
    //     int index1 = sc.nextInt();
    //     int index2 = sc.nextInt();
    //     swap(arr , index1 , index2);
    // }
// }
