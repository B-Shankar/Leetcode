package ArraysAndArrayList.sorting.heap_sort;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int heapSize, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < heapSize && arr[left] > arr[largest])
            largest = left;

        if (right < heapSize && arr[right] > arr[largest])
            largest = right;

        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        heapSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
