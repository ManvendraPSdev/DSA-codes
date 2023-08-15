// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

public class find_dublicates_in_Array {

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int DublicateNumber(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {      // Till here we have Sorted the Array
                swap(arr, i, correct);
            } else {
                i++;
            }
         }
         for (int index = 0; index < arr.length; index++) {
            if (arr[index] == arr.length-1) {
                return arr[index];
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2, 2};
        System.out.println(DublicateNumber(arr));
    }

}