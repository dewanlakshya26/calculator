package lakshya.calculation.calculator.sorting.techniques;

import org.springframework.stereotype.Component;

public class HeapSort implements SortingExecutor {

    @Override
    public void sort(int[] digits) {
        int n = digits.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(digits, n, i);
        
        for (int i=n-1; i>0; i--)
        {
            
            int temp = digits[0];
            digits[0] = digits[i];
            digits[i] = temp;
            heapify(digits, i, 0);
        }

    }

    void heapify(int digits[], int n, int i)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 

        if (l < n && digits[l] > digits[largest])
            largest = l;

        if (r < n && digits[r] > digits[largest])
            largest = r;

        if (largest != i)
        {
            int swap = digits[i];
            digits[i] = digits[largest];
            digits[largest] = swap;

            heapify(digits, n, largest);
        }
    }
}
