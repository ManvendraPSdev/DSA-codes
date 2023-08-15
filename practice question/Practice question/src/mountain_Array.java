public class mountain_Array {

    static int MA(int arr[] ){
        int start = 0 ;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2 ;
            if(arr[mid] > arr[mid+1]){
                end = mid ; 
            }
            else{
                start = mid+1;
            } 
        }
        return start ; // you can return any either end or start because in the end they are ointing to the same element    }

    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,3,1} ;
        System.out.println(MA(arr ));
    }

}
