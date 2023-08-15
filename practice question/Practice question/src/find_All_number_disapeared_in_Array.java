import java.util.ArrayList;
import java.util.List;

class find_All_number_disapeared_in_Array {

    static void swap(int arr[], int first_index, int second_index) {
        int temp = arr[first_index];
        arr[first_index] = arr[second_index];
        arr[second_index] = temp;
    }

    static List<Integer> find_Disappeared_Numbers(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3 };
        List<Integer> result = find_Disappeared_Numbers(arr);
        System.out.println(result);
    }
}
