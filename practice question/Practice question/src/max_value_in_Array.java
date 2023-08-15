public class max_value_in_Array {
    static int max(int arr[]){
        int max_val = arr[0];
        for(int i=0; i<arr.length ; i++){
            if(arr[i]> max_val){
                 max_val=arr[i] ;  // arr[i] = max_val;
            }
        }
        return(max_val);     // return (arr[i]);
    }
    public static void main(String[] args) {
        int arr[] = {23,45,667,86,23,11,12};
        System.out.println("Maximum value in the array is : "+max(arr));
    }
    
}
