public class Minimum_Difference_Element_in_Sorted_Array {
    static int MD(int arr[] , int target){    // Here MD = Minimum Difference

        int mid = Binary_Search(arr , target , 0 , arr.length-1);
        if(target == mid){
            return mid ;
        }
        else{
            return FLOOR_Element(arr , target);
        }
    }
    static int FLOOR_Element(int []arr , int target){

        //if the target element is the samllest element in the Array
        if(target<arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2  ;
            if(target>arr[mid]){
                start = mid +1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }

    static int Binary_Search(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] =  {-18, -12, -4, 0, 2, 3, 4, 11 , 13 , 16, 18, 22, 89};
        int target = 12;
        System.out.println(MD(arr , target));
    }
}
