package Week2.Acara7_8;

import java.util.Scanner;

public class Acara2_1 {

    public static void main(String[] args) {
        
        // Membuat variabel
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        // Mengambil input
        System.out.println("Inputkan nilai: ");
        nilai = scan.nextInt();
        
        // Hitung grade
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        // Cetak
        System.out.println("Grade: " + grade);
    }
}
