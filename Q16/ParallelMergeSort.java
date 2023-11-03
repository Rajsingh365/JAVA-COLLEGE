package Q16;

import java.util.Arrays;

public class ParallelMergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        parallelMergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void parallelMergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        parallelMergeSort(arr, temp, 0, arr.length - 1);
    }

    public static void parallelMergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            Thread leftThread = new Thread(() -> {
                parallelMergeSort(arr, temp, left, mid);
            });
            Thread rightThread = new Thread(() -> {
                parallelMergeSort(arr, temp, mid + 1, right);
            });

            leftThread.start();
            rightThread.start();

            try {
                leftThread.join();
                rightThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            merge(arr, temp, left, mid, right);
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
}
