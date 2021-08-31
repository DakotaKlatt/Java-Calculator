public class Calculator {
    /*
           Calculator functions as the model for the application.
           All data manipulation and value storage is done here.
    */

    private String value1;
    private String value2;
    private String operation;
    private Boolean whichValue;

    public Calculator(){
       //constructor

        value1 = "";
        value2 = "";
        operation = "";
        whichValue = true;
    }

    public void updateValue(String value) {
        //updates current value stored with newly entered number
        if(whichValue) {
            value1 = value1+value;
        }
        else {
            value2 = value2+value;
        }

        System.out.println("current values: " + value1+ " "+value2);
    }

    public String getValue() {
        //gets the current value that should be displayed in the window
        return (whichValue)?value1:value2;
    }

    public void action(String desiredAction) {
        // based on desired function (action) calculator will store or process values
        System.out.println("action"+ desiredAction);
        switch(desiredAction) {
            case "add","subtract","divide","multiply":
                setOperator(desiredAction);
                break;
            case "posNeg":
                posNeg();
                break;
            case "equals":
                equals();
                break;
            case "clear":
                clear();
                break;
        }

    }

    private void clear() {
        //clears out previous values and operation
        value1 = "";
        value2 = "";
        operation = "";
        whichValue = true;
    }

    private void add() {
        value1 = String.valueOf(Float.parseFloat(value1) + Float.parseFloat(value2));
        value2 = "";
    }

    private void subtract() {
        value1 =  String.valueOf(Float.parseFloat(value1) - Float.parseFloat(value2));
        value2 = "";
    }

    private void divide() {
        value1 = String.valueOf(Float.parseFloat(value1) / Float.parseFloat(value2));
        value2 = "";
    }

    private void multiply() {
        value1 = String.valueOf(Float.parseFloat(value1) * Float.parseFloat(value2));
        value2 = "";
    }

    private void posNeg() {
        //converts current value to positive or negative
        if(whichValue) {
            if(value1 != ""){
                value1 = String.valueOf(Float.parseFloat(value1) * (-1));
            }
        }
        else {
            if(value2 != ""){
                value2 = String.valueOf(Float.parseFloat(value2) * (-1));
            }
        }
    }

    private void equals() {
        //operation is performed (calculated) based on previously selected operator
        try {
            whichValue = true;//resets flag to allow for newly calculated value to be further manipulated
            switch(operation) {
                case "add":
                    add();
                    break;
                case "subtract":
                    subtract();
                    break;
                case "divide":
                    divide();
                    break;
                case "multiply":
                    multiply();
                    break;
            }
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }

    private void setOperator(String operator) {
        // sets operator
        operation = operator;
        whichValue = !whichValue;
    }

}
