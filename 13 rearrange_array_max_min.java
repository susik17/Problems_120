

class Main {
        //tc:O(n) -sorted or O(nlogn) -if array not already sorted sc:O(1)
    //space optimization - using modularity - stores 2 values on same index using encode and decode the neccessary values 
    static void rearrange(int[] arr,int n){
        int end = n - 1;
        int start = 0;
        int maxElem = arr[n - 1] + 1; // Must be > all elements

    for (int i = 0; i < n; i++) {
        if (i % 2 == 0){
            arr[i] += (arr[end] % maxElem) * maxElem;// <-- fixed here
            end--;
        }
        else{
            arr[i] += (arr[start] % maxElem) * maxElem;
        start++;}
    }

    // Decode new values
    for (int i = 0; i < n; i++) {
        arr[i] = arr[i] / maxElem;
    }
   }
    /* 
    //tc:O(n) or O(nlogn) -if array not already sorted sc:O(n)
    static void rearrange(int[] arr,int n){
        int start = 0,end=n - 1,k=0;
       int[] new_arr = new int[n];
       while(start<=end){
           if(k<n){
               //add largest
               new_arr[k] = arr[end];
               k++;
               end--;
           }
           if(k<n){
               //add small
               new_arr[k] = arr[start];
               k++;
               start++;
           }
           for (int num : new_arr) {
            System.out.print(num+" ");
        }
      }
        
    }
        
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr =new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       rearrange(arr,n); 
        
   
       }
       */
}
/* 
ip:
5 
1 2 3 4 5
op:
5 1 4 2 3 
Explanation example -Modularity:
✅ Example
Suppose:
arr = [1, 2, 3, 4, 5, 6]
After sorting: [1, 2, 3, 4, 5, 6]
maxElem = 7 (since max = 6)
Start encoding like:

At i = 0: largest is 6 → arr[0] = 1 + 6*7 = 43

At i = 1: smallest is 1 → arr[1] = 2 + 1*7 = 9



Decode:

arr[0] = 43 / 7 = 6

arr[1] = 9 / 7 = 1

✅ Output is rearranged: [6, 1, 5, 2, 4, 3]
*/
