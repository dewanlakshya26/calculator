package lakshya.calculation.calculator.model.enums;

public enum Operator{
    PLUS("+"), MINUS("-"), DIVIDE("/"), MULTIPLY("*");
    private String operation;

    public String getOperation() {
        return operation;
    }

    Operator(String operation) {
        this.operation = operation;
    }
}
