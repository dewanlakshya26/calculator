package lakshya.calculation.calculator.sorting.techniques;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleSort implements SortingExecutor {
    Logger logger = LoggerFactory.getLogger(BubbleSort.class);


    @Override
    public void sort(int[] digits) {

        logger.info("performing bubble sort");
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
