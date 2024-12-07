import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame ;
    JTextField textField;
    JButton buttonNum1;
    JButton buttonNum2;
    JButton buttonNum3;
    JButton buttonAdd;
    JButton buttonNum4;
    JButton buttonNum5;
    JButton buttonNum6;
    JButton buttonMulti;
    JButton buttonNum7;
    JButton buttonNum8;
    JButton buttonNum9;
    JButton buttonDivide;
    JButton buttonDecimal;
    JButton buttonZero;
    JButton buttonEqual;
    JButton buttonMinus;
    JButton buttonDelete;
    JButton buttonClear;
    String operation = "";
    double firstInput = 0.0;
    double secondInput = 0.0;
    public Calculator(){


    }
    public void setupAndShowMainFrame(){

        frame  = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(350,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setBackground(Color.black);

    }
    public void createANdShowButtons(){
        //text field

        textField = new JTextField();
        textField.setBounds(30,40,270,40);
        frame.add(textField);
        //-------------------------
        //1  -  2  -  3  -  +

        buttonNum1 = new JButton("1");

        buttonNum2 = new JButton("2");

        buttonNum3 = new JButton("3");

        buttonAdd = new JButton("+");

        buttonNum1.addActionListener(this);
        buttonNum2.addActionListener(this);
        buttonNum3.addActionListener(this);
        buttonAdd.addActionListener(this);

        buttonNum1.setBounds(40,100,50,40);
        buttonNum2.setBounds(110,100,50,40);
        buttonNum3.setBounds(180,100,50,40);
        buttonAdd.setBounds(250,100,50,40);
        frame.add(buttonNum1);
        frame.add(buttonNum2);
        frame.add(buttonNum3);
        frame.add(buttonAdd);


        //-------------------------
        //4  -  5  -  6  -  *

        buttonNum4 = new JButton("4");

        buttonNum5 = new JButton("5");

        buttonNum6 = new JButton("6");

        buttonMulti = new JButton("*");

        buttonNum4.addActionListener(this);
        buttonNum5.addActionListener(this);
        buttonNum6.addActionListener(this);
        buttonMulti.addActionListener(this);

        buttonNum4.setBounds(40,170,50,40);
        buttonNum5.setBounds(110,170,50,40);
        buttonNum6.setBounds(180,170,50,40);
        buttonMulti.setBounds(250,170,50,40);

        frame.add(buttonNum4);
        frame.add(buttonNum5);
        frame.add(buttonNum6);
        frame.add(buttonMulti);

        //7  -  8  -  9  -  /

        buttonNum7 = new JButton("7");

        buttonNum8 = new JButton("8");

        buttonNum9 = new JButton("9");

        buttonDivide = new JButton("/");

        buttonNum7.addActionListener(this);
        buttonNum8.addActionListener(this);
        buttonNum9.addActionListener(this);
        buttonDivide.addActionListener(this);

        buttonNum7.setBounds(40,240,50,40);
        buttonNum8.setBounds(110,240,50,40);
        buttonNum9.setBounds(180,240,50,40);
        buttonDivide.setBounds(250,240,50,40);

        frame.add(buttonNum7);
        frame.add(buttonNum8);
        frame.add(buttonNum9);
        frame.add(buttonDivide);

        //.  -  0  -  =  -  -

        buttonDecimal = new JButton(".");

        buttonZero = new JButton("0");

        buttonEqual = new JButton("=");

        buttonMinus = new JButton("-");

        buttonDecimal.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonMinus.addActionListener(this);

        buttonDecimal.setBounds(40,310,50,40);
        buttonZero.setBounds(110,310,50,40);
        buttonEqual.setBounds(180,310,50,40);
        buttonMinus.setBounds(250,310,50,40);

        frame.add(buttonDecimal);
        frame.add(buttonZero);
        frame.add(buttonEqual);
        frame.add(buttonMinus);

        //clear  -  delete

        buttonDelete = new JButton("Delete");

        buttonClear = new JButton("Clear");
        buttonDelete.addActionListener(this);
        buttonClear.addActionListener(this);


        buttonDelete.setBounds(60,380,80,40);
        buttonClear.setBounds(180,380,80,40);

        frame.add(buttonDelete);
        frame.add(buttonClear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonNum1) {
            textField.setText(textField.getText().concat("1"));
        }
        if (e.getSource() == buttonNum2) {
            textField.setText(textField.getText().concat("2"));
        }
        if (e.getSource() == buttonNum3) {
            textField.setText(textField.getText().concat("3"));
        }
        if (e.getSource() == buttonAdd){
           firstInput = Double.parseDouble(textField.getText());

            operation = "+";
            textField.setText("");
        }
        //----------------
        if (e.getSource() == buttonNum4) {
            textField.setText(textField.getText().concat("4"));
        }
        if (e.getSource() == buttonNum5) {
            textField.setText(textField.getText().concat("5"));
        }
        if (e.getSource() == buttonNum6) {
            textField.setText(textField.getText().concat("6"));
        }
        if (e.getSource() == buttonMulti) {
            firstInput = Double.parseDouble(textField.getText());
            operation = "*";
            textField.setText("");
        }
        //-----------------
        if (e.getSource() == buttonNum7) {
            textField.setText(textField.getText().concat("7"));
        }
        if (e.getSource() == buttonNum8) {
            textField.setText(textField.getText().concat("8"));
        }
        if (e.getSource() == buttonNum9) {
            textField.setText(textField.getText().concat("9"));
        }
        if (e.getSource() == buttonDivide) {
            firstInput = Double.parseDouble(textField.getText());
            operation = "/";
            textField.setText("");
        }
        //--------------------
        if (e.getSource() == buttonDecimal) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == buttonZero) {
            textField.setText(textField.getText().concat("0"));
        }
        if (e.getSource() == buttonEqual) {
            secondInput = Double.parseDouble(textField.getText());
            if (operation.equals("+")){
                double result = firstInput + secondInput;
                textField.setText(result + ""); // converting double to string
            }
            if (operation.equals("*")){
                double result = firstInput * secondInput;
                textField.setText(result + "");
            }
            if (operation.equals("-")){
                double result = firstInput - secondInput;
                textField.setText(result + "");
            }
            if (operation.equals("/")){
                double result = firstInput / secondInput;
                textField.setText(result + "");
            }
        }
        if (e.getSource() == buttonMinus) {
            firstInput = Double.parseDouble(textField.getText());
            operation = "-";
            textField.setText("");
        }
        //------------------
        if (e.getSource() == buttonClear) {
            textField.setText("");
            operation = "";
        }
        if (e.getSource() == buttonDelete) {
            String content = textField.getText();
            textField.setText("");
            for (int i = 0; i < content.length() -1; i++) {
                textField.setText(textField.getText() + content.charAt(i));
            }
        }
    }
}