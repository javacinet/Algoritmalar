package ogrenciler.dogukanAydin.Sort;

public class MyBubbleSort {

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps = 1;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }


}