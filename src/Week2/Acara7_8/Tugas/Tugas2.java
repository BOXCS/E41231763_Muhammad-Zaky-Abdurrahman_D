package Week2.Acara7_8.Tugas;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("        CAFE CERIA");
        System.out.println("       ANEKA MINUMAN");
        
        System.out.println("----------------------------");

            System.out.println("       SPECIAL MENU");
            System.out.println("      1.  Soft drinks");
            System.out.println("      2.  Mix juice");
            System.out.println("      3.  Nescafe");
            System.out.println("      4.  Soda milk");
            System.out.println("      5.  Tea");

            System.out.println("----------------------------");
            
            System.out.print("Masukkan nama pembeli: ");
            String name = scanner.nextLine();

            System.out.println("");

            System.out.print("Silahkan masukkan pilihan anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Minuman yang anda pesan adalah Soft drinks");
                    break;
                case 2:
                    System.out.println("Minuman yang anda pesan adalah Mix juice");
                    break;
                case 3:
                    System.out.println("Minuman yang anda pesan adalah Nescafe");
                    break;
                case 4:
                    System.out.println("Minuman yang anda pesan adalah Soda milk");
                    break;
                case 5:
                    System.out.println("Minuman yang anda pesan adalah Tea");
                    break;
                default:
                    System.out.println("Maaf " + name + ", pilihan anda tidak tersedia");
                    
                    scanner.close();
                    return;
            }
            
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terimakasih " + name + " telah berkunjung di Cafe Ceria" );
            
            scanner.close();
        }
    }
