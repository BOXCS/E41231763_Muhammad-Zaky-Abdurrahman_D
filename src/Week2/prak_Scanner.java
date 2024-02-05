package Week2;

import java.util.Scanner;

public class prak_Scanner {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        
        // Ambil nilai
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = sc.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = sc.nextInt();
        
        // Hitung
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
