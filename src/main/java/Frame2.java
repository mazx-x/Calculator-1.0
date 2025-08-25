import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Frame2 extends JFrame implements ActionListener {
    private JPanel MainPanel;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button0;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMul;
    private JButton buttonDiv;
    private JButton buttoneq;
    private JButton buttonClr;
    private JButton buttonDec;
    private JButton buttonSqrt;
    private JTextField textField2;
    private JButton buttonPow;
    private JButton buttonPlusOrMinus;
    private JPanel numPanel;
    private JPanel funcPanel;
    private JPanel displayPanel;
    private JScrollPane displayScrollPane;
    private JButton buttonSettings;
    private JScrollPane extraDisplayScrollPane;
    private double num1 = 0;
    private double num2 = 0;
    private char operator;
    private BigDecimal bd;
    private SettingsMenu settingsMenu;

    public Frame2() {
        init();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        MainPanel = new JPanel();
        textField2 = new JTextField();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button0 = new JButton();
        buttonPlus = new JButton();
        buttonMinus = new JButton();
        buttonMul = new JButton();
        buttonDiv = new JButton();
        buttoneq = new JButton();
        buttonClr = new JButton();
        buttonDec = new JButton();
        buttonSqrt = new JButton();
        buttonPow = new JButton();
        buttonPlusOrMinus = new JButton();
        numPanel = new JPanel();
        funcPanel = new JPanel();
        displayPanel = new JPanel();
        displayScrollPane = new JScrollPane();
        buttonSettings = new JButton();
        extraDisplayScrollPane = new JScrollPane();

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonClr.addActionListener(this);
        buttonDec.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttoneq.addActionListener(this);
        buttonPow.addActionListener(this);
        buttonPlusOrMinus.addActionListener(this);
        buttonSettings.addActionListener(this);


    }

    private void init() {
        setContentPane(MainPanel);
        setMinimumSize(new Dimension(450, 370));
        setTitle("GUI-Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0) {
            textField1.setText(textField1.getText().concat("0"));
        } else if (e.getSource() == button1) {
            textField1.setText(textField1.getText().concat("1"));
        } else if (e.getSource() == button2) {
            textField1.setText(textField1.getText().concat("2"));
        } else if (e.getSource() == button3) {
            textField1.setText(textField1.getText().concat("3"));
        } else if (e.getSource() == button4) {
            textField1.setText(textField1.getText().concat("4"));
        } else if (e.getSource() == button5) {
            textField1.setText(textField1.getText().concat("5"));
        } else if (e.getSource() == button6) {
            textField1.setText(textField1.getText().concat("6"));
        } else if (e.getSource() == button7) {
            textField1.setText(textField1.getText().concat("7"));
        } else if (e.getSource() == button8) {
            textField1.setText(textField1.getText().concat("8"));

        } else if (e.getSource() == button9) {
            textField1.setText(textField1.getText().concat("9"));

        } else if (e.getSource() == buttonClr) {
            textField1.setText("");
            textField2.setText("");

        } else if (e.getSource() == buttonDec) {
            if (!textField1.getText().contains(".")) {
                textField1.setText(textField1.getText().concat("."));
            }

        } else if (e.getSource() == buttonPlus) {
            if (!(textField1.getText().equals(""))) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                removeDecTextField2(num1,'+');
                operator = '+';
            }

        } else if (e.getSource() == buttonMinus) {
            if (!(textField1.getText().equals(""))) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                removeDecTextField2(num1,'-');
                operator = '-';
            }

        } else if (e.getSource() == buttonMul) {
            if (!(textField1.getText().equals(""))) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                removeDecTextField2(num1,'*');
                operator = '*';
            }

        } else if (e.getSource() == buttonDiv) {
            if (!(textField1.getText().equals(""))) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                removeDecTextField2(num1,'/');
                operator = '/';
            }

        } else if (e.getSource() == buttonPow) {
            if (!(textField1.getText().equals(""))) {
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                removeDecTextField2(num1,'^');
                operator = '^';
            }
        } else if (e.getSource() == buttonSettings) {
            settingsMenu = new SettingsMenu(this);
            settingsMenu.setVisible(true);

        } else if (e.getSource() == buttonPlusOrMinus) {
            if (!(textField1.getText().equals(""))) {
                num1 = Double.parseDouble(textField1.getText());
            }
            if (!(num1 == 0)) {
                removeDecTextField1(num1 * -1);
            }
        } else if (e.getSource() == buttonSqrt) {
            if (!(textField1.getText().equals(""))) {
                num1 = Double.parseDouble(textField1.getText());
                double resultSqrt = Math.sqrt(num1);
                bd = new BigDecimal(resultSqrt).setScale(2, RoundingMode.DOWN);
                resultSqrt = bd.doubleValue();
                removeDecTextField1(resultSqrt);
            }

        } else if (e.getSource() == buttoneq) {

                textField2.setText(" ");

                double result = 0;
                num2 = Double.parseDouble(textField1.getText());

                switch (operator) {
                    case '+' -> {
                        result = num1 + num2;
                        removeDecTextField1(result);
                    }
                    case '-' -> {
                        result = num1 - num2;
                        removeDecTextField1(result);
                    }
                    case '*' -> {
                        result = num1 * num2;
                        removeDecTextField1(result);
                    }
                    case '/' -> {
                        result = num1 / num2;
                        removeDecTextField1(result);
                    }
                    case '^' -> {
                        result = Math.pow(num1, num2);
                        removeDecTextField1(result);
                    }

                }
        }
    }
    private void removeDecTextField1(double result){
        if (result == (long) result) {
            bd = new BigDecimal(result).setScale(2, RoundingMode.DOWN);
            result = bd.doubleValue();
            textField1.setText(String.valueOf((long) result));
        } else {
            textField1.setText(String.valueOf(result));
        }
    }
    private void removeDecTextField2(double result ,char operator){
        if (result == (long) result) {
            bd = new BigDecimal(result).setScale(2, RoundingMode.DOWN);
            result = bd.doubleValue();
            textField2.setText(String.valueOf((long) result).concat(String.valueOf(operator)));
        } else {
            textField2.setText(String.valueOf(result).concat(String.valueOf(operator)));
        }
    }
}

