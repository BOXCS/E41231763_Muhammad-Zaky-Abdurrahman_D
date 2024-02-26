package Week4.Acara15_16;

public class SequentialSearch {

//    static final int nf = -1;
    
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int target = 25;

        int result = sequentialSearch(array, target);

        if (result != -1) {
            System.out.println("Target " + target + " found on the index " + result + ".");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
    
    static int sequentialSearch(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i; // Elemen ditemukan, kembalikan indeks
            }
        }

        return -1; // Elemen tidak ditemukan
    }
}
