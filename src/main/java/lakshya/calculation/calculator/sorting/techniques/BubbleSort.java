package lakshya.calculation.calculator.sorting.techniques;


public class BubbleSort implements SortingExecutor {

    @Override
    public void sort(int[] digits) {

            int n = digits.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (digits[j] > digits[j + 1]) {
                        int temp = digits[j];
                        digits[j] = digits[j + 1];
                        digits[j + 1] = temp;
                    }


    }
}
