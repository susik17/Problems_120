import java.util.Scanner;
class Main {
    static String reverse_string(String s,String r,int i){
        if(i<0) return r;
        else{
           return reverse_string(s,r+s.charAt(i),i-1);
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse_string = reverse_string(s,"",s.length()-1);
        if(s.equals(reverse_string)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
