package Week4.Acara13_14;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {78, 44, 32, 20, 25, 15, 100};

        System.out.print("Array sebelum diurutkan : ");
        printArray(array);

        selectionSort(array);

        System.out.print("Array setelah diurutkan : ");
        printArray(array);
    }

    static void selectionSort(int[] arr) {
        int a = arr.length;

        for (int i = 0; i < a - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar elemen terkecil dengan elemen pertama yang belum terurut
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
