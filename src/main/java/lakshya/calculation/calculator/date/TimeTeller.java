package lakshya.calculation.calculator.date;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class TimeTeller {
    public static Timestamp getCurrentTime() {
        return new Timestamp(System.currentTimeMillis());

    }

}
