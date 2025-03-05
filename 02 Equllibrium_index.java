import java.util.*;
class Main {
     
    //bruteforce -O(n^2)
    static int equllibrium_index1(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int left_sum = 0,right_sum = 0;
            for(int j=0;j<i;j++){
                 left_sum += arr[j];
            }
            for(int k=i+1;k<n;k++){
                 right_sum += arr[k];
            }
            if(left_sum == right_sum){
                return i;
            }   
        }
        return -1;
    }
    //optimal O(n)
    static int equllibrium_index(int[] arr,int n){
        int total = 0,left_sum =0,right_sum=0;
        //find total_sum
        for(int i=0;i<=n-1;i++){
            total += arr[i];
        }
        for(int i=0;i<=n-1;i++){
            right_sum = total-left_sum-arr[i];
            if(left_sum == right_sum){
                return i;
            }
            //update left_sum
            left_sum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
       System.out.print(equllibrium_index1(arr,n));
    }
}
/*
ip:
4
1 2 0 3
op:
2
*/
