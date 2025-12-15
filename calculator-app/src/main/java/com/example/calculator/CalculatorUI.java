package com.example.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {

    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;
    private Calculator calculator;

    public CalculatorUI() {
        calculator = new Calculator();
        setTitle("Calculator App");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        JButton addBtn = new JButton("Add");
        add(addBtn);
        JButton subBtn = new JButton("Subtract");
        add(subBtn);
        JButton mulBtn = new JButton("Multiply");
        add(mulBtn);
        JButton divBtn = new JButton("Divide");
        add(divBtn);

        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        addBtn.addActionListener(e -> calculate("add"));
        subBtn.addActionListener(e -> calculate("sub"));
        mulBtn.addActionListener(e -> calculate("mul"));
        divBtn.addActionListener(e -> calculate("div"));
    }

    private void calculate(String op){
        try{
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double result = switch(op){
                case "add" -> calculator.add(n1,n2);
                case "sub" -> calculator.subtract(n1,n2);
                case "mul" -> calculator.multiply(n1,n2);
                case "div" -> calculator.divide(n1,n2);
                default -> 0;
            };
            resultLabel.setText("Result: " + result);
        } catch(Exception ex){
            resultLabel.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new CalculatorUI().setVisible(true));
    }
}
