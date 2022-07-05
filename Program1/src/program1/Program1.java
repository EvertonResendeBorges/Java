package program1;

public class Program1 {
    
    static int x = 5;
   
    public static void main(String[] args) {
       
        
       System.out.println(x);
        
        x = 5;
        
        while(x >= 1){
           x--;
            
            System.out.println("X = "+x);
            if(x % 2 == 0){
                System.out.println(x*x);
            } else {
                System.out.println(x);
            }
        }
        
    }
    
}
