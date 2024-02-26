package Week3.Acara9_10;

import java.util.Scanner;

public class Genap_For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = sc.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = sc.nextInt();
        
        System.out.println("Bilangan genap dari " + batasAwal + " hingga " + batasAkhir + ":");
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
