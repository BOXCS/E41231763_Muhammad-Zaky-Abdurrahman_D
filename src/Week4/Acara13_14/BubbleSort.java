package Week4.Acara13_14;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {78, 44, 32, 20, 25, 15, 100};
        
        System.out.print("Array sebelum diurutkan : ");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.print("Array setelah diurutkan : ");
        printArray(array);
    }
    
    static void bubbleSort(int[] arr) {
        int a = arr.length;
        
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar saat elemen j lebih besar dari elemen ke j+1
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
