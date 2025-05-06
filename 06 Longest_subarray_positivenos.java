// "static void main" must be defined in a public class.
import java.util.*;
class Main {
    //include negative no's also
    static void largest_sum(int[] arr){
        int recent_sum = arr[0],max_sum = arr[0];
        int start = 0,end = 0,temp_start = 0;
        for(int i=1;i<arr.length;i++){
            if (arr[i] > recent_sum + arr[i]) {
            recent_sum = arr[i];
            temp_start = i; // potential new start
             } else {
            recent_sum += arr[i];
             }
             if(recent_sum > max_sum){
               max_sum = recent_sum;
               start = temp_start;
               end = i;
              } 
        }
           
        for(int k = start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println(max_sum);
    }
    /*
    //Kadanes algorithm - include only positive no's
    static void largest_sum(int[] arr){
        int recent_sum = arr[0],max_sum = arr[0];
        int start = 0,end = 0,temp_start = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=0){
              recent_sum += arr[i];
              if(recent_sum > max_sum){
               max_sum = recent_sum;
               start = temp_start;
               end = i;
              } 
            }
            else{
                recent_sum = 0;
                temp_start = i+1;
            }
        }
           
        for(int k = start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println(max_sum);
    }
    
    /*
    //two pointer - sliding window
    static void largest_sum(int[] arr){
        int n = arr.length;
        int sum = 0,max_sum = 0;
        int i = 0,j = 0;
        int start = 0 , end = -1;
        while(i<n && j<n){
            if(arr[i]<0){
                sum = 0;
                j = i+1;
                i++;
            }
            else if(arr[i]>=0){
                sum += arr[i];
                if(sum > max_sum){
                    max_sum = sum;
                    start = j;
                    end = i;
                    
                }
                i++;
                
           }
            
       }
        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
          
        }
        
        System.out.println(max_sum);
      
    }
    */
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        largest_sum(arr);
        
    }
}
/*
Array : {¬2, 7, 5, ¬1, 3, 2, 9, ¬7} 

Output: 
     Sum : 14 
     Elements : 3, 2, 9 
     */