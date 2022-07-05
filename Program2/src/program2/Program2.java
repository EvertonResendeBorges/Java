package program2;

public class Program2 {

    public static void main(String[] args) {

        String s = "Java"; System.out.println(s);
        s.concat(" SE 7"); System.out.println("Concat: "+s);
        s.replace('7', '8'); System.out.println("Replace: "+s);
        System.out.print(s);
        
        System.out.println("\n");
        System.out.println(s.concat(" SE 7"));
        System.out.println(s.replace("Java", "Python"));
        
        System.out.println("\n");
        System.out.println(s);
        s = s.concat(" Bom demais");
        System.out.println(s);
        s = s.replace("Java","Python");
        System.out.println(s);

    }

}
