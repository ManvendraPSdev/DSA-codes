import java.util.Arrays;

public class Selection_Sort {


    static int get_max_element(int arr[] , int start , int end){
        int max = start;
        for(int i=start ; i<=end ; i++){
            if(arr[max]<arr[i]){
                max = i;    
            }
        }
        return max ;
    }


    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    static void selection_sort(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            int end = arr.length-i-1;
            int max_index = get_max_element(arr, 0 , end);
            swap(arr , max_index , end );
        }
    }


    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
