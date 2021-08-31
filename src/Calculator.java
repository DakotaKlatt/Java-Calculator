public class Calculator {
    private String value1;
    private String value2;
    private String operation;
    private Boolean whichValue;
    public Calculator(){
        System.out.println("constrtuctor");
        value1 = "";
        value2 = "";
        operation = "";
        whichValue = true;
    }

    public String getValue() {
        System.out.println("getvalue");
        return (whichValue)?value1:value2;
    }
    public void clear() {
        // TODO Auto-generated method stub
        System.out.println("clear");
        value1 = "";
        value2 = "";
        whichValue = true;
    }
    public void add() {
        System.out.println("add");
        value1 = String.valueOf(Integer.parseInt(value1) + Integer.parseInt(value2));
        value2 = "";
    }
    public void subtract() {
        // TODO Auto-generated method stub
        System.out.println("sub");
        value1 =  String.valueOf(Integer.parseInt(value1) - Integer.parseInt(value2));
        value2 = "";
    }
    public void divide() {
        // TODO Auto-generated method stub
        System.out.println("div");
        value1 = String.valueOf(Integer.parseInt(value1) / Integer.parseInt(value2));
        value2 = "";
    }
    public void multiply() {
        // TODO Auto-generated method stub
        System.out.println("mul");
        value1 = String.valueOf(Integer.parseInt(value1) * Integer.parseInt(value2));
        value2 = "";
    }



    public void equals() {
        // TODO Auto-generated method stub
        try {
            whichValue = true;
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

    public void updateValue(String value) {
        // TODO Auto-generated method stub
        System.out.println("update");
        if(whichValue) {
            value1 = value1+value;

        }
        else {
            value2 = value2+value;
        }

        System.out.println("current values: " + value1+ " "+value2);
    }

    private void setOperator(String operator) {
        // TODO Auto-generated method stub
        operation = operator;
        whichValue = !whichValue;
    }


    public void action(String desiredAction) {
        // TODO Auto-generated method stub
        System.out.println("action"+ desiredAction);
        switch(desiredAction) {
            case "add","subtract","divide","multiply":
                setOperator(desiredAction);
                break;
            case "equals":
                equals();
                break;
            case "clear":
                clear();
                break;
        }



    }

}
