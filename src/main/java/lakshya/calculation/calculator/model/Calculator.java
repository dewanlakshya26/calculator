package lakshya.calculation.calculator.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Calculator {
    @Getter
    private int[] digits;
    @Getter
    private String operation;
    @Getter
    private String[] algorithm;

}




