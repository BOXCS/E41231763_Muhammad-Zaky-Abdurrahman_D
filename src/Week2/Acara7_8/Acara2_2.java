package Week2.Acara7_8;

import java.util.Scanner;

public class Acara2_2 {

    public static void main(String[] args) {

        // Membuat variabel
        String lampu;
        Scanner scan = new Scanner(System.in);

        // Mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}
