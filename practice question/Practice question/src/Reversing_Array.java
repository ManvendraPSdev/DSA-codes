import java.util.Arrays;

public class Reversing_Array {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = new int[9];
        for(int i=arr1.length-1 , j =0 ; i>=0 ; i-- , j++ ){
            arr2[j] = arr1[i];
        }
        for(int i = 0 ; i<arr1.length ; i++){
            arr1[i] = arr2[i];
        }
        // System.out.println(arr1);  dont use this because Apologies for the confusion. The output `I@3fee733d` is the default representation of an array when you directly print it using `System.out.println(arr1)`.

// The reason you see this output is because `arr1` is an array object, and when you directly print an object using `System.out.println()`, it calls the `toString()` method of that object. In the case of arrays, the default implementation of `toString()` in the `Object` class is used, which returns a string representation of the object's class name followed by the `@` symbol and the hash code of the object.

// To print the contents of the array, you need to use `Arrays.toString(arr1)` as I mentioned earlier. This will properly convert the array into a string representation that displays the individual elements of the array.

// So, in summary, using `System.out.println(Arrays.toString(arr1))` will print the contents of the array `arr1`, while `System.out.println(arr1)` will print the default string representation of the array object, which includes the class name and hash code.
        System.out.println(Arrays.toString(arr1));
    }
    
}
