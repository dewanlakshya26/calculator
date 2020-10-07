package lakshya.calculation.calculator.sorting.techniques;


public class QuickSort implements SortingExecutor {

    @Override
    public void sort(int[] digits) {
        bubbleSort(digits, 0, digits.length - 1);
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }



    void bubbleSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);


            bubbleSort(arr, low, pi - 1);
            bubbleSort(arr, pi + 1, high);
        }
    }
}
