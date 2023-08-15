public class InsertingElementInSortedList {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 16, 17, 19, 20};
        int num = 18;   // Now we have to insert this element at index 8
        int i = arr.length - 1;
        
        while (i >= 0 && arr[i] > num) {
            arr[i + 1] = arr[i];
            i--;
        }
        
        arr[i + 1] = num;
        
        // Print the modified array
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
