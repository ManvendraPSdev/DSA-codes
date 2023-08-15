// return the Greatest number Which is less than equal to target element

public class find_floor_number {
    static int binary_Search(int []arr , int target){

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
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] =  {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 89};
        int target = 5;
        System.out.println(binary_Search(arr , target));
    }
}