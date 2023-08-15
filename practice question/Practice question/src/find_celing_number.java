// If you dont understand the code watch kunal video again
// return the Smallest Element of the Array which is greater than or equal to the target

public class find_celing_number {
    static int binary_Search(int []arr , int target){
// What if the target Element is greater than the greatest element present in the Array
        if(target>arr[arr.length-1]){
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
        return start;
    }
    public static void main(String[] args) {
        int arr[] =  {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 89};
        int target = 15;
        System.out.println(binary_Search(arr , target));
    }
}
// The code you provided is for finding the ceiling number in a sorted array using binary search. The ceiling number refers to the smallest number in the array that is greater than or equal to the target value.

// Here's a step-by-step explanation of the code:

// 1. The `binary_Search` method takes two parameters: `arr`, which represents the sorted array, and `target`, which is the value we want to find the ceiling number for.

// 2. The method initializes the `start` variable to 0, representing the start index of the array, and the `end` variable to `arr.length - 1`, representing the end index of the array.

// 3. The method enters a while loop with the condition `start <= end`, which means the loop will continue until the search space has been exhausted.

// 4. Within the loop, the method calculates the middle index `mid` using the formula `start + (end - start) / 2`. This determines the middle element of the current search space.

// 5. If the `target` is greater than the middle element `arr[mid]`, it means the ceiling number should be in the right half of the search space. Therefore, the `start` index is updated to `mid + 1` to search in the right half.

// 6. If the `target` is less than the middle element `arr[mid]`, it means the ceiling number should be in the left half of the search space. Therefore, the `end` index is updated to `mid - 1` to search in the left half.

// 7. If the `target` is equal to the middle element `arr[mid]`, it means the `target` itself is the ceiling number. The method returns the `mid` index.

// 8. If the `target` is not found within the search space, the loop exits, and the method returns the `start` index as the ceiling number. The `start` index points to the smallest number greater than the `target` in the array.

// In the `main` method, the code provides an example usage of the `binary_Search` method. It creates an array `arr` and sets the target value to 15. The sorted array is {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 89}.

// By calling `binary_Search(arr, target)`, the code will find the ceiling number for the target value. In this case, the target is 15, and the smallest number greater than or equal to 15 in the array is 15 itself. Therefore, the output of the code will be the index of 15 in the array, which is 7.

// Overall, this code demonstrates the concept of finding the ceiling number in a sorted array using binary search. It efficiently narrows down the search space by comparing the target value with the middle element, allowing for faster retrieval of the ceiling number.


// Q = How did the while loop break 
// ChatGPT

// Answer = 
// In the given code, the while loop breaks when the condition start <= end is no longer true. This condition ensures that the loop continues as long as there is a valid search space available.

// Inside the while loop, there are three possible scenarios:

// If the target is greater than the middle element arr[mid], it means the ceiling number should be in the right half of the search space. Therefore, the start index is updated to mid + 1, effectively narrowing down the search space to the right half.

// If the target is less than the middle element arr[mid], it means the ceiling number should be in the left half of the search space. Therefore, the end index is updated to mid - 1, effectively narrowing down the search space to the left half.

// If the target is equal to the middle element arr[mid], it means the target itself is the ceiling number. The method returns the mid index, and the loop breaks.

// The while loop continues until one of the following conditions is met:

// The target is found, and the method returns the corresponding index.
// The start index becomes greater than the end index, indicating that the search space has been exhausted.
// In the case where the target is not found within the search space, the loop will break when start becomes greater than end. This happens when the search space is reduced to a single element or when it becomes empty. At that point, the method returns the start index, which represents the smallest number greater than the target in the array.

// Therefore, the loop breaks based on the condition start <= end, and the specific scenario within the loop determines whether the target is found or not, leading to the appropriate return value.