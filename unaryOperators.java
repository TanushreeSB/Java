public class Main{
    public static void main(String[] args){
        System.out.println("Hello maa");
        int x = 5;
 
        System.out.println(Integer.toBinaryString(x));
        int y = x >> 2;
        System.out.println(y);
        
        int z = -5;
        System.out.println(Integer.toBinaryString(z));
        int q = z >> 2;
        System.out.println(q);
        System.out.println(Integer.toBinaryString(q));
        
        int m = z >>> 2;
        System.out.println(m);
        System.out.println(Integer.toBinaryString(m));
    }
    
}
