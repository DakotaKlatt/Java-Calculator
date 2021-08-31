public class CalculatorController {
    /*
        CalculationController manages the communication between the calculatorView and
        the Calculator(Model).
    */

    private CalculatorView calcView;
    private Calculator calculator;

    public CalculatorController(CalculatorView calcView,Calculator calculator) {

        this.calcView = calcView;
        this.calculator = calculator;

        //get a button from the View, Set the action listener with a listener created in this Controller.
        //This is done to allow for the controller to have access to the listener
        this.calcView.getButton("0").addActionListener(e ->valueButtonListener("0"));
        this.calcView.getButton("1").addActionListener(e ->valueButtonListener("1"));
        this.calcView.getButton("2").addActionListener(e ->valueButtonListener("2"));
        this.calcView.getButton("3").addActionListener(e ->valueButtonListener("3"));
        this.calcView.getButton("4").addActionListener(e ->valueButtonListener("4"));
        this.calcView.getButton("5").addActionListener(e ->valueButtonListener("5"));
        this.calcView.getButton("6").addActionListener(e ->valueButtonListener("6"));
        this.calcView.getButton("7").addActionListener(e ->valueButtonListener("7"));
        this.calcView.getButton("8").addActionListener(e ->valueButtonListener("8"));
        this.calcView.getButton("9").addActionListener(e ->valueButtonListener("9"));

        this.calcView.getButton("add").addActionListener(e ->functionButtonListener("add"));
        this.calcView.getButton("subtract").addActionListener(e ->functionButtonListener("subtract"));
        this.calcView.getButton("divide").addActionListener(e ->functionButtonListener("divide"));
        this.calcView.getButton("multiply").addActionListener(e ->functionButtonListener("multiply"));
        this.calcView.getButton("equals").addActionListener(e ->functionButtonListener("equals"));
        this.calcView.getButton("posNeg").addActionListener(e ->functionButtonListener("posNeg"));
        this.calcView.getButton("clear").addActionListener(e ->functionButtonListener("clear"));

    }

    private void  valueButtonListener(String value) {
        this.calculator.updateValue(value);
        this.calcView.setValue(calculator.getValue());

    }

    private void  functionButtonListener(String value) {
        this.calculator.action(value);
        this.calcView.setValue(calculator.getValue());

    }

}
