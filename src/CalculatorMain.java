public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorView calcView = new CalculatorView();
        Calculator calculator = new Calculator();
        CalculatorController calcController = new CalculatorController(calcView,calculator);
    }
}
