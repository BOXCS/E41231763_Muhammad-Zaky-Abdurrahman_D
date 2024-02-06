package Week2.Acara7_8.Tugas;

import java.util.Scanner;

public class Tugas1 {

    private static int[] prices = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");

        System.out.println("         Kharisma Agung Plaza (KAP) >          ");
        System.out.println("          Promo Belanja Berhadiah                ");
        System.out.println("     Khusus Pembelian 5 Barang Pertama       ");
        System.out.println("     Dengan harga minimum Rp 10000,00     ");
        System.out.print("|           Masukkan nama pembeli: ");
        String customerName = scanner.nextLine();
        
        System.out.println("-------------------------------------------------");

        // Input prices from the user
        boolean pricesEmpty = true;
        for (int i = 0; i < prices.length; i++) {
            System.out.print("|Masukkan harga barang ke-" + (i + 1) + ": ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break; // Stop input loop if the user presses Enter without entering a price
            }

            try {
                prices[i] = Integer.parseInt(input);
                if (prices[i] >= 10000) {  // Added check for minimum value
                    pricesEmpty = false;
                } else {
                    System.out.println("Harga barang harus minimal Rp 10.000. Silakan masukkan kembali.");
                    i--; // Decrement i to re-enter the current price
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid. Silakan masukkan kembali.");
                i--; // Decrement i to re-enter the current price
            }
        }

        if (pricesEmpty) {
            System.out.println("Terima Kasih");
            System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
        } else {
            int totalPrice = calculateTotalPrice();

            System.out.println("Total harga pembelian atas nama " + customerName + " adalah Rp " + totalPrice);

            if (!pricesEmpty && calculateTotalPrice() >= 10000 && cekhadiahterpenuhi()) {
                System.out.println("Selamat....");
                System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            }
            System.out.println("Terima Kasih");
            System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    public static int calculateTotalPrice() {
        int totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        return totalPrice;
    }

    public static boolean cekhadiahterpenuhi() {
        int minimumPrice = 10000;
        int count = 0;
        for (int price : prices) {
            if (price >= minimumPrice) {
                count++;
            }
        }
        return count >= 5;
    }
}
