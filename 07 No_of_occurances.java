import java.util.*;
class Main {
    //sorted -Binary Search
    static void countOccurrences(int[] arr) {
         for (int i = 0; i < arr.length; ) {
            int num = arr[i];
            int left = binarySearchLeft(arr, num);
            int right = binarySearchRight(arr, num);
            
            System.out.println(num + " - " + (right - left + 1));

            // Move to the next number after the current one is fully counted
            i = right + 1;
        }
    }

    // Binary search for the leftmost index (first occurrence of num)
    static int binarySearchLeft(int[] arr, int num) {
        int left = 0, right = arr.length - 1, result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= num) {
                right = mid - 1;
                if (arr[mid] == num) result = mid; // record first occurrence
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    // Binary search for the rightmost index (last occurrence of num)
    static int binarySearchRight(int[] arr, int num) {
        int left = 0, right = arr.length - 1, result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= num) {
                left = mid + 1;
                if (arr[mid] == num) result = mid; // record last occurrence
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    /*
    //unsorted
    static void largest_sum(int[] arr){
        Map <Integer , Integer> map = new Hashmap<>();
        for(int num : arr){
            if(map.containskey(num)){
                map.put(num , map.get(num)+1);//increment if count exists 
            }
            else{
                map.put(num , 1);//set 1 to count
             }
        }
        for (int key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

    } 
    */
       
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        no_of_occurances(arr);
        
    }
}
/*
 Given an array of positive integers. The output should be the number of occurrences of each number.
Example:
Input: {2, 3, 2, 6, 1, 6, 2}
Output:
1 – 1
2 – 3
3 – 1
6 – 2
     */
