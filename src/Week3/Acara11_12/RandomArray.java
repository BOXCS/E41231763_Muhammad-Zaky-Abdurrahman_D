package Week3.Acara11_12;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang Array: ");
        int length = sc.nextInt();
        int[] randomArray = new int[length];
        Random random = new Random();
        
        System.out.println("Random Array:");
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(100);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
