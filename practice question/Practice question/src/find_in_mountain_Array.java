public class find_in_mountain_Array {

    static int search(int arr[] , int target){
        int peak = peakelement(arr);
        int FirstTry = OrderAgnoBS(arr , target , 0 , peak);
        if(FirstTry != -1){
            return FirstTry;
        }
        return(OrderAgnoBS(arr , target , peak +1 , arr.length-1));
    }

    static int OrderAgnoBS(int arr[], int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    static int peakelement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // binary search
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;  // Here I can write end & mid also as both pointing to the Same Greatest Element
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 3, 2, 2, 2, 1 };
        int target = 2;
        System.out.println(search(arr, target));
    }
}
