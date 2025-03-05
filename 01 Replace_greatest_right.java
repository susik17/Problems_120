import java.util.*;
class Main {
     /*
    //bruteforce - O(n^2)
    static int[] replace_greatest_right(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int max = -1;
            for(int j=i+1;j<=n-1;j++){
                max = Math.max(max,arr[j]);
            }
            arr[i] = max;
        }
        return arr;
    }
    */
    
    
    
    //optimal O(n)
    //Traverse from right to left
    static int[] replace_greatest_right(int[] arr,int n){
        int max = arr[n-1];
        arr[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max,temp);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        replace_greatest_right(arr,n);
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*
ip:
6
16 17 4 3 5 2
op:
17 5 5 5 2 -1 
*/