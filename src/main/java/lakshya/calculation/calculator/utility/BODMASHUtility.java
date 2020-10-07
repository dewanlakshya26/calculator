package lakshya.calculation.calculator.utility;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BODMASHUtility {


    public int doAddition(int[] array) {
        return Arrays.stream(array).sum();
    }


    public int doSubstraction(int[] digits) {
        int result = 0;
        for (int i = 0; i < digits.length - 1; i++) {
            result = (digits[i] - digits[i + 1]) - result;
        }
        return result;
    }

    public int doMultiplication(int[] digits) {
        int result = 1;
        for (int i = 0; i < digits.length - 1; i++) {
            result = (digits[i] * digits[i + 1]) * result;
        }
        return result;


    }

    public int doDivision(int[] digits) {
        int result = 1;
        for (int i = 0; i < digits.length - 1; i++) {
            try {

            result = (digits[i] / digits[i + 1]) / result;}
            catch (ArithmeticException e){}
        }
        return result;
    }
}
