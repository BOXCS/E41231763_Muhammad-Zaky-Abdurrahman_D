package Week3.Acara9_10;

public class Bil_Kelipatan {

    public static void main(String[] args) {
        int i = 1;
        
        System.out.println("            Do While");
        System.out.println("   Bilangan kelipatan 2 (1-100)");
        System.out.println("====================================");
        
        do {            
            if (i % 2 == 0) {
                System.out.print("   " + i + " ");
            }
            i *= 2;

        } while (i <= 100);
        
        System.out.println();
    }
}
