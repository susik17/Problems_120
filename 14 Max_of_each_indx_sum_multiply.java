
class Main {
    static int calculate_max(int n){
        int sum = 0,product = 1;
        while(n>0){
            int digit = n%10;
            sum += digit;
            product = digit*product;
            n = n/10;
        }
        return Math.max(sum,product);
        
        
    }
    static void Max_of_each_index(int[] arr,int length){
        for(int i=0;i<length;i++){
            arr[i] = calculate_max(arr[i]);
       }
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr =new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       Max_of_each_index(arr,n); 
        for (int num : arr) {
            System.out.print(num+" ");
        }

    }
}
/*
ip:
5 
120 24 71 10 59
op:
3 8 8 1 45 
*/
