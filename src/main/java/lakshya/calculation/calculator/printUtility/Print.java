package lakshya.calculation.calculator.printUtility;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

@Component
public class Print {
    public String printResult(Timestamp startTime, int[] result, Timestamp endTime){
        return "Start Time : "+ startTime +"\n" + "Result is : " + Arrays.toString(result) + "\n" + "end time " + endTime;
    }
}
