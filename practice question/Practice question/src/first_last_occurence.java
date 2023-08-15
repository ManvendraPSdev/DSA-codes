public class first_last_occurence {
    static int FO(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1 ;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target <arr[mid]){
                end = mid -1;
            }
            else{
                ans = mid ;
                end = mid-1;
            }
        }
        return ans;
    }
    static int LO(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1 ;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target <arr[mid]){
                end = mid -1;
            }
            else{
                ans = mid ;
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,2,2,3,4,5,6,6};
        int target = 2;
        System.out.println("First occurence is "+FO(arr,target));
        System.out.println("last occurence is "+LO(arr, target));
    }
}
