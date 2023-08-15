import java.util.Arrays;

public class Reversing_Array_2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0 , j=arr.length-1 ; i<j ; i++ , j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
// This code reverses the elements of the arr array using a two-pointer approach. The for loop iterates from the start and end of the array simultaneously, swapping the corresponding elements until the pointers meet in the middle. Here's how it works:

// The array arr is initialized with the values {1, 2, 3, 4, 5, 6, 7, 8, 9}.
// The for loop is set up with two variables i and j, initialized to the start and end indices of the array (0 and arr.length - 1 respectively).
// In each iteration of the loop, the value at index i is swapped with the value at index j using a temporary variable temp. This effectively reverses the elements of the array.
// The i variable is incremented, and the j variable is decremented, causing the loop to continue until i is no longer less than j, meaning the pointers have crossed.
// Finally, System.out.println(Arrays.toString(arr)) is used to print the reversed array in a readable format using the Arrays.toString() method.
// The output of this code will be: [9, 8, 7, 6, 5, 4, 3, 2, 1], which represents the elements of the arr array in reversed order.





