package Week4.Acara15_16;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {15, 20, 25, 32, 44, 78, 100};
        int target = 78;

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Target " + target + " found on the index " + result + ".");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Elemen ditemukan, kembalikan indeks
            } else if (arr[mid] < target) {
                low = mid + 1; // Pindah ke setengah kanan
            } else {
                high = mid - 1; // Pindah ke setengah kiri
            }
        }

        return -1; // Elemen tidak ditemukan
    }
}
