package lakshya.calculation.calculator.service;

import lakshya.calculation.calculator.model.Calculator;
import lakshya.calculation.calculator.sorting.techniques.SortFactory;
import lakshya.calculation.calculator.utility.BODMASHUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class Executor {

    @Autowired
    BODMASHUtility utility;

    @Autowired
    SortFactory sortFactory;


    public int[] execute(Calculator calculator) {
        boolean sortToggle = checkForSorting(calculator.getOperation());
        int[] result = new int[calculator.getDigits().length];

        if (!sortToggle) {

            switch (calculator.getOperation()) {
                case "+":
                    result[0] = utility.doAddition(calculator.getDigits());
                    break;

                case "-":
                    result[0] = utility.doSubstraction(calculator.getDigits());
                    break;

                case "*":
                    result[0] = utility.doMultiplication(calculator.getDigits());
                    break;

                case "/":
                    result[0] = utility.doDivision(calculator.getDigits());
                    break;

            }
        } else return performSorting(calculator);

        return new int[]{result[0]} ;
    }

    private int[] performSorting(Calculator calculator) {
        for (int i = 0; i < calculator.getAlgorithm().length; i++) {
            sortFactory.performSorting(calculator.getAlgorithm()[i], calculator.getDigits());
        }
        return calculator.getDigits();
    }

    private boolean checkForSorting(String operation) {
        return operation.equals("sort");
    }
}
