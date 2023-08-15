public class search_in_Rotated_sorted_Array_of_duplicate_Element {

    static int findPivotWithDuplicates(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end -start)/2 ;
             if(mid > end && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            else if(mid <start && arr[mid-1] > arr[mid]){
                return arr[mid-1];
            }

            else if (arr[start] < arr[mid]) {
                end = mid - 1;
            } 
            else if (arr[start] > arr[mid]) {
                start = mid + 1;
            }

            if(arr[mid]==arr[start] && arr[mid] == arr[end]){

                if(arr[start]> arr[start+1]){
                    return start;
                }
                start ++;

                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                end -- ;
            }

        }
        return -1;
    }


    static int binarySearch(int []nums , int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start)/2  ;
            if(target>nums[mid]){
                start = mid +1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        System.out.println(findPivotWithDuplicates(arr));
    }
}
