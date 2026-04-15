import java.util.Scanner;

public class numberUnit {
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<4;i++){
            int num = scan.nextInt();

            if(num == 1){
                System.out.println("One");
            }else if(num == 10){
                System.out.println("Ten");
            }else if(num == 100){
                System.out.println("Hundred");
            }else if(num == 1000){
                System.out.println("Thousand");
            }
        }
        scan.close();
    }
}
