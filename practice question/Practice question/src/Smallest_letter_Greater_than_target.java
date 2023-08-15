// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.



public class Smallest_letter_Greater_than_target {
    static int Celling(int letters[] , int target){
          int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (start % letters.length);
    }
    public static void main(String[] args) {
        int arr[] = {'b' , 'c' , 'd' , 'f'};
        int target = 'a' ;
        System.out.println(Celling(arr , target));
    }    
}
