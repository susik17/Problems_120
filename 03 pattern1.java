public class Main {
    public static void main(String[] args) {
        String s ="PROGRAM";
        int n = s.length();
        int mid = n/2-1;//less 1 due to I take inner loop from 1
        for(int j=1;j<=n;j++){
               for(int i=1;i<=j;i++){
                    int index = mid+i;
                    if(index >= n){
                        index = index - n;
                    }
                   System.out.print(s.charAt(index));
               }
              System.out.println();
            
       }
    }
}
/* 
pattern:
G
GR
GRA
GRAM
GRAMP
GRAMPR
GRAMPRO
*/