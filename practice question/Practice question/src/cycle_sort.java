import java.util.Arrays;

public class cycle_sort {

    static void swap(int arr[] , int first_index , int second_index){
        int temp = arr[first_index];
        arr[first_index] = arr[second_index];
        arr[second_index] = temp;
    }

    static void CYCLE_SORT(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;  // since index = value -1;  so from now onwards correct store the index of the number 
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,2, 2};
        CYCLE_SORT(arr);
        System.out.println(Arrays.toString(arr));
    }
}
