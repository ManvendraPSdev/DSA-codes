public class firstOCCURENCE_in_Infinite_Array {


    // For infinite Array
    static int array(int arr[] , int target){
        int start = 0 ;
        int end = 1 ;
        while(target >= arr[end]){

            // start = end;             //  Use Either this or below one 
            // end = end*2;

            int temp = end+1;
            // double the box value
            // end = previous end + sizeofbox*2
            
            end = end +(end-start+1)*2 ;
            start = temp ; 
        }
        return FO(arr , target , 0 , end );
    }

// For first Occurence of the Element 
    static int FO(int arr[] , int target , int start , int end){
    
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

    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 9, 10 ,10 , 10 , 10 ,10, 90,
                100, 130, 140, 160, 170};
        int target = 9;
        System.out.println(array(arr , target));
    }

}
