package lakshya.calculation.calculator.utility;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BODMASHUtility {

    private Logger logger = LoggerFactory.getLogger(BODMASHUtility.class);

    public int doAddition(int[] array) {
        logger.info("performing addition");
        return Arrays.stream(array).sum();
    }


    public int doSubstraction(int[] digits) {
        logger.info("performing subtraction");
        int result = 0;
        for (int i = 0; i < digits.length - 1; i++) {
            result = (digits[i] - digits[i + 1]) - result;
        }
        return result;
    }

    public int doMultiplication(int[] digits) {
        logger.info("performing multiplication");
        int result = 1;
        for (int i = 0; i < digits.length - 1; i++) {
            result = (digits[i] * digits[i + 1]) * result;
        }
        return result;


    }

    public int doDivision(int[] digits) {
        logger.info("performing division");
        int result = 1;
        for (int i = 0; i < digits.length - 1; i++) {
            try {
                result = (digits[i] / digits[i + 1]) / result;
            } catch (ArithmeticException e) {
            }
        }
        return result;
    }
}
