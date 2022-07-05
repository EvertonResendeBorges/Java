package program4;

public class Program4 {

    public static void main(String[] args) {
        
        int a,b,c;
        a = 5;
        b = 3;
        
        System.out.println("A = "+a);
         System.out.println("B = "+b);
        System.out.println("");
        
        c = a++ + ++b;
        
        System.out.println("A = "+a);
         System.out.println("B = "+b);
        System.out.println("C = "+c);
        
        System.out.println("Valores = "+ a + b + c);
        
    }
    
}
