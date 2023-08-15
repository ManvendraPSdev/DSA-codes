// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 public class majority_Element {

    static void swap(int arr[], int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp ;
    }

    static int ME(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i] !=correct){
                swap(arr , arr[i] , correct);
            }
            else{
                i++;
            }
        }

        int majority_Element = arr.length/2;

        for(int index =0 ; index<arr.length ; index++){
            if (arr[i] == arr[i + majority_Element]) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3, 3, 4, 4, 4, 4};
        int majorityElement = ME(nums);
        System.out.println("Majority element: " + majorityElement);
    }
}
