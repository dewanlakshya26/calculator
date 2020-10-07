package lakshya.calculation.calculator.controller;


import lakshya.calculation.calculator.date.TimeTeller;
import lakshya.calculation.calculator.model.Calculator;
import lakshya.calculation.calculator.printUtility.Print;
import lakshya.calculation.calculator.service.Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("calculator/v1")
public class CalculatotController {

    @Autowired
    Executor executor;

    @Autowired
    Print printUtility;



    @PostMapping("/calculate")
    public String perform(@Validated @RequestBody Calculator calculator) {
        Timestamp startTime = TimeTeller.getCurrentTime();
        int[] result = executor.execute(calculator);
        Timestamp endTime = TimeTeller.getCurrentTime();

        return printUtility.printResult(startTime, result, endTime);
    }

}
