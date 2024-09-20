package view;

import controller.Control;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private double num1;
    private double num2;
    private char operation;
    private double result;
    private JPanel mainPanel;
    private JTextField txtDisplay;
    private JButton btnPercentage;
    private JButton btnClearE;
    private JButton btnClear;
    private JButton btnDelete;
    private JButton btnFractionNumerator1;
    private JButton btnSquared;
    private JButton btnSquareRoot;
    private JButton btnDivision;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnMultiplication;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSubtraction;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnAddition;
    private JButton btnNegative;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnEqual;
    Control control = new Control();


    public App() {
        btnPercentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(txtDisplay.getText());
                operation = '%';
                txtDisplay.setText(String.valueOf(num2 / 100));
            }
        });
        btnClearE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = 0;
                num2 = 0;
                txtDisplay.setText("");
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = txtDisplay.getText();
                if(!number.isEmpty()){
                    String newNumber = number.substring(0, txtDisplay.getText().length() - 1);
                    txtDisplay.setText(newNumber);
                }
            }
        });
        btnFractionNumerator1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = 'F';
            }
        });
        btnSquared.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = '^';
            }
        });
        btnSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = 'S';
            }
        });
        btnDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = '/';
                txtDisplay.setText("");
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = txtDisplay.getText() + btnSeven.getText();
                txtDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = txtDisplay.getText() + btnEight.getText();
                txtDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = txtDisplay.getText() + btnNine.getText();
                txtDisplay.setText(btnNineText);
            }
        });
        btnMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = '*';
                txtDisplay.setText("");
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = txtDisplay.getText() + btnFour.getText();
                txtDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = txtDisplay.getText() + btnFive.getText();
                txtDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = txtDisplay.getText() + btnSix.getText();
                txtDisplay.setText(btnSixText);
            }
        });
        btnSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = '-';
                txtDisplay.setText("");
            }
        });
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = txtDisplay.getText() + btnOne.getText();
                txtDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = txtDisplay.getText() + btnTwo.getText();
                txtDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = txtDisplay.getText() + btnThree.getText();
                txtDisplay.setText(btnThreeText);
            }
        });
        btnAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtDisplay.getText());
                operation = '+';
                txtDisplay.setText("");
            }
        });
        btnNegative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("-");
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = txtDisplay.getText() + btnZero.getText();
                txtDisplay.setText(btnZeroText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().contains(".")) {
                    String btnCommaText = txtDisplay.getText() + btnPoint.getText();
                    txtDisplay.setText(btnCommaText);

                }
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(txtDisplay.getText());

                if(operation == '%') {
                    result = control.operationToDo(num1, num2 * 100, operation);
                    // txtDisplay.setText(String.valueOf(result));
                    num1 = 0;
                    num2 = 0;
                }else if(operation == '/' || operation == 'F'){
                    if(num2 == 0){
                        String error = "ERROR, DIVISION POR CERO.";
                        txtDisplay.setText(error);

                    }else {
                        result = control.operationToDo(num1, num2, operation);
                        //txtDisplay.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                    }
                }else {
                    result = control.operationToDo(num1, num2, operation);
                    // txtDisplay.setText(String.valueOf(result));
                    num1 = 0;
                    num2 = 0;
                }

                if(result == (long) result) {
                    txtDisplay.setText(String.valueOf((long) result));
                } else {
                    txtDisplay.setText(String.valueOf(result));
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
