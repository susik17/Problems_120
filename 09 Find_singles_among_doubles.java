 class Main {
    /*
     static int search(int n,int[] arr){
        int ans = arr[0];
        for(int i=1;i<=n-1;i++){
           ans = ans^arr[i];
        }
        return ans;
        
    }

     */
    static int search(int n,int[] arr){
        if(n==1){
            return arr[0];
          }
        if(arr[0]!=arr[1]){return arr[0];}
        if(arr[n-1]!=arr[n-2]){return arr[n-1];}

        int l = 1;
        int h = n-2;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid]==arr[mid-1]){
                l = mid+1;
              }
          else{
              h = mid-1;
          }   
        }
        return arr[l];
    }
    public static void main(String[] args) {
        int n = 7;
        int arr[] ={2, 2, 5, 5, 20, 30, 30};
        System.out.println(search(n,arr));
    }
}
//op:20