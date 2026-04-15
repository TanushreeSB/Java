import java.util.Scanner;

public class revNum{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
       int rev = 0;
       
       while(num != 0){
           int digit = num % 10;
           rev = rev*10 + digit;
           num = num / 10;
       }
       System.out.println(rev);
    }
} 
