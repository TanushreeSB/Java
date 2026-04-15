import java.util.Scanner;

public class sumNum2{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int sum = 0;
        int i = 1;
        while(i<=n){
             sum += i;
             i++;
       }
       System.out.println(sum);
       scan.close();
    }
} 
