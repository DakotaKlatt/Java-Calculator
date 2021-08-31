import javax.swing.*;
import java.awt.*;

public class CalculatorView {
    /**
     *
     */

    private JFrame frame;
    private JPanel panel;
    private JTextField textField;

    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonEquals;
    private JButton buttonClear;


    public CalculatorView(){
        frame = new JFrame();
        panel = new JPanel();
        textField = new JTextField(15);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("X");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");

        frame.setSize(600,200);
        frame.setLayout(new GridLayout(0,3));

        panel.add(textField);

        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonAdd);

        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonSubtract);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMultiply);

        panel.add(buttonClear);
        panel.add(button0);
        panel.add(buttonEquals);
        panel.add(buttonDivide);



        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);

        //this.pack();

    }

    public String getValue() {
        return textField.getText();
    }

    public void setValue(String text) {
        textField.setText(text);
    }

    public JButton getButton(String button) {
        switch(button) {
            case "0":
                return button0;
            case "1":
                return button1;
            case "2":
                return button2;
            case "3":
                return button3;
            case "4":
                return button4;
            case "5":
                return button5;
            case "6":
                return button6;
            case "7":
                return button7;
            case "8":
                return button8;
            case "9":
                return button9;
            case "add":
                return buttonAdd;
            case "subtract":
                return buttonSubtract;
            case "divide":
                return buttonDivide;
            case "multiply":
                return buttonMultiply;
            case "equals":
                return buttonEquals;
            case "clear":
                return buttonClear;
        }
        return null;
    }


}
