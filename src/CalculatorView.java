import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CalculatorView {
    /*
     CalculatorView provides the GUI for the application
     */

    private JTextField textField;
    private HashMap<String,JButton> buttonMap;

    public CalculatorView(){
        // constructor 
        
        JFrame frame = new JFrame();
        JPanel panelTop = new JPanel();
        JPanel panelBottom = new JPanel();

        buttonMap = new HashMap<String,JButton>();

        textField = new JTextField(15);//text field is the primary value display for the calculator
        Font font1 = new Font("SansSerif",Font.BOLD,40);
        textField.setFont(font1);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        createButtonMap();//creates hashmap for storage of buttons
        
        List<String> buttonNames = createButtonNameList();

        panelTop.add(textField);
        
        for(String buttonName:buttonNames){
            panelBottom = addButtonPanel(panelBottom, buttonMap.get(buttonName));
        }

        //formatting of button pad
        panelBottom.setBackground(new Color(150,150,150));
        panelBottom.setBorder(BorderFactory.createBevelBorder(0));
        panelBottom.setBounds(150,100,300,300);

        //formatting of value display
        panelTop.setBackground(new Color(150,150,150));
        panelTop.setBorder(BorderFactory.createBevelBorder(0));
        panelTop.setBounds(50,50,500,400);
        panelTop.setLayout(new GridLayout(2,1));

        frame.setSize(600,500);//frame represents the window
        panelBottom.setLayout(new GridLayout(0,4));
        frame.setLayout(null);
        panelTop.add(panelBottom);//combines the bottom button pad with value display
        frame.add(panelTop);//adds both panels to the window

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);//enables window upon application run
    }

    private void createButtonMap(){
        //creates a button and then adds the  button to button hashmap

        JButton button0 = new JButton("0");
        buttonMap.put("0",button0);
        JButton button1 = new JButton("1");
        buttonMap.put("1",button1);
        JButton button2 = new JButton("2");
        buttonMap.put("2",button2);
        JButton button3 = new JButton("3");
        buttonMap.put("3",button3);
        JButton button4 = new JButton("4");
        buttonMap.put("4",button4);
        JButton button5 = new JButton("5");
        buttonMap.put("5",button5);
        JButton button6 = new JButton("6");
        buttonMap.put("6",button6);
        JButton button7 = new JButton("7");
        buttonMap.put("7",button7);
        JButton button8 = new JButton("8");
        buttonMap.put("8",button8);
        JButton button9 = new JButton("9");
        buttonMap.put("9",button9);

        JButton buttonAdd = new JButton("+");
        buttonMap.put("add",buttonAdd);
        JButton buttonSubtract = new JButton("-");
        buttonMap.put("subtract",buttonSubtract);
        JButton buttonMultiply = new JButton("X");
        buttonMap.put("multiply",buttonMultiply);
        JButton buttonDivide = new JButton("/");
        buttonMap.put("divide",buttonDivide);
        JButton buttonEquals = new JButton("=");
        buttonMap.put("equals",buttonEquals);
        JButton buttonClear = new JButton("C");
        buttonMap.put("clear",buttonClear);
        JButton buttonPosNeg = new JButton("+/-");
        buttonMap.put("posNeg",buttonPosNeg);
    }

    private  List<String> createButtonNameList(){
        /*
            The order in which the button name is added to the List. Determines where the
            button will be displayed in the GUI. TopLeft -> BottomRight.
         */

        List<String> buttonNames = new ArrayList<String>();

        buttonNames.add("7");
        buttonNames.add("8");
        buttonNames.add("9");
        buttonNames.add("add");

        buttonNames.add("4");
        buttonNames.add("5");
        buttonNames.add("6");
        buttonNames.add("subtract");

        buttonNames.add("1");
        buttonNames.add("2");
        buttonNames.add("3");
        buttonNames.add("multiply");

        buttonNames.add("posNeg");
        buttonNames.add("0");
        buttonNames.add("equals");
        buttonNames.add("divide");

        buttonNames.add("clear");
        return buttonNames;
    }

    private JPanel addButtonPanel(JPanel panel, JButton button) {
        panel.add(button);
        return panel;
    }

    public void setValue(String text) {
        //sets value of text field

        if(text != ""){
            //if the value contains trailing Zeros, the Zeros are removed
            Float textValue = Float.parseFloat(text);
            DecimalFormat format = new DecimalFormat("0.#");
            text = format.format(textValue);
        }

        textField.setText(text);
    }

    public JButton getButton(String button) {
        //returns desired button based on button name (key)
        return buttonMap.get(button);
    }

}
