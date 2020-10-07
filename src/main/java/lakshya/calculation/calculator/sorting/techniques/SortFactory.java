package lakshya.calculation.calculator.sorting.techniques;


import org.springframework.stereotype.Component;

@Component
public class SortFactory {

    public void performSorting(String sortingType, int[] digits){
        switch (sortingType.toUpperCase()){
            case "QUICK" : new QuickSort().sort(digits);
            break;

            case "BUBBLE" : new BubbleSort().sort(digits);
            break;

            case "HEAP" : new HeapSort().sort(digits);
            break;
        }
    }



}
