// There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

// Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k],
//  nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become 
//  [4,5,6,6,7,0,1,2,4,4].

// Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

class SearchInRotatedSortedArray {

    static int findPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                start++; // Handles the case of duplicates
            }
        }

        return -1;
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    static boolean search(int[] arr, int target) {
        int pivotIndex = findPivotIndex(arr);

        if (pivotIndex == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivotIndex] == target) {
            return true;
        } else if (target >= arr[0] && target <= arr[pivotIndex]) {
            return binarySearch(arr, target, 0, pivotIndex);
        } else {
            return binarySearch(arr, target, pivotIndex + 1, arr.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1};
        int target = 0;

        boolean found = search(arr, target);
        System.out.println("Target found: " + found);
    }
}
