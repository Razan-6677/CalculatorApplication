import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApplication implements ActionListener {
    double number, answer;
    int calculation;
    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonLog = new JButton("log");
    JButton buttonMod = new JButton("%");
    JButton buttonSin = new JButton("sin");
    JButton buttonAbs = new JButton("|x|");
    JButton buttonFact = new JButton("n!");

    public CalculatorApplication() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public final void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(400, 530); 
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.pink);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public final void addComponents() {
        label.setBounds(340, 0, 60, 50);
        label.setForeground(Color.black);
        label.setFont(new Font("Arial", Font.BOLD, 17));
        frame.add(label);

        textField.setBounds(10, 40, 360, 50);
        textField.setFont(new Font("Arial", Font.BOLD, 27));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(90, 110, 65, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 20));
        onRadioButton.setBackground(new Color(240, 128,128));
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 110, 65, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 18));
        offRadioButton.setBackground(new Color(240, 128,128));
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        addButtons();

        buttonClear.setBounds(170, 110, 90, 40);
        buttonDelete.setBounds(270,110, 90,40 );
        buttonClear.setFont(new Font("Arial", Font.BOLD, 17));
        buttonClear.setBackground(new Color(216, 191, 216));
        buttonClear.setForeground(Color.white);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 17));
        buttonDelete.setBackground(new Color(216, 191, 216));
        buttonDelete.setForeground(Color.white);
        frame.add(buttonClear);
        frame.add(buttonDelete);
    }
    private void addButtons() {
        JButton[] numberButtons = {
            buttonOne, buttonTwo, buttonThree, 
            buttonFour, buttonFive, buttonSix, 
            buttonSeven, buttonEight, buttonNine,
            buttonZero, buttonDot
        };

        
        int[][] positions = {
            {10, 230}, {80, 230}, {150, 230}, 
            {10, 290}, {80, 290}, {150, 290}, 
            {10, 350}, {80, 350}, {150, 350}, 
            {80, 410}, {150, 410} 
        };

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            numberButtons[i].setBounds(positions[i][0], positions[i][1], 60, 40);
            frame.add(numberButtons[i]);
        }

        
        buttonPlus.setBounds(300, 290, 60, 40);
        buttonMinus.setBounds(290, 170, 70, 40);
        buttonMul.setBounds(300, 230, 60, 40);
        buttonDiv.setBounds(300, 350, 60, 40);
        buttonSqrt.setBounds(10, 170, 70, 40);
        buttonSquare.setBounds(95, 170, 70, 40);
        buttonLog.setBounds(180, 170, 90, 40); 
        buttonEqual.setBounds(300, 405 , 60, 50);

        buttonMod.setBounds(220, 350, 70, 40); 
        buttonSin.setBounds(220, 230, 70, 40); 
        buttonAbs.setBounds(220, 290, 70, 40);
        buttonFact.setBounds(220,410, 70, 40); 

        for (JButton button : new JButton[]{buttonPlus, buttonMinus, buttonMul, buttonDiv, buttonEqual, buttonSqrt, buttonSquare, buttonLog, buttonMod, buttonSin, buttonAbs, buttonFact}) {
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setBackground(new Color(255, 245,230));
            frame.add(button);
        }
    }

    public final void addActionEvent() {
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonLog.addActionListener(this);
        buttonMod.addActionListener(this); 
        buttonSin.addActionListener(this); 
        buttonAbs.addActionListener(this);
        buttonFact.addActionListener(this); 
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }
@Override
public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();

    if (source == onRadioButton) {
        enable();
    } else if (source == offRadioButton) {
        disable();
    } else if (source == buttonZero) {
        textField.setText(textField.getText() + "0");
    } else if (source == buttonOne) {
        textField.setText(textField.getText() + "1");
    } else if (source == buttonTwo) {
        textField.setText(textField.getText() + "2");
    } else if (source == buttonThree) {
        textField.setText(textField.getText() + "3");
    } else if (source == buttonFour) {
        textField.setText(textField.getText() + "4");
    } else if (source == buttonFive) {
        textField.setText(textField.getText() + "5");
    } else if (source == buttonSix) {
        textField.setText(textField.getText() + "6");
    } else if (source == buttonSeven) {
        textField.setText(textField.getText() + "7");
    } else if (source == buttonEight) {
        textField.setText(textField.getText() + "8");
    } else if (source == buttonNine) {
        textField.setText(textField.getText() + "9");
    } else if (source == buttonDot) {
        if (!textField.getText().contains(".")) {
            textField.setText(textField.getText() + ".");
        }
    } else if (source == buttonPlus) {
        number = Double.parseDouble(textField.getText());
        calculation = 1; 
        textField.setText("");
        label.setText(number + "+");
    } else if (source == buttonMinus) {
        number = Double.parseDouble(textField.getText());
        calculation = 2; 
        textField.setText("");
        label.setText(number + "-");
    } else if (source == buttonMul) {
        number = Double.parseDouble(textField.getText());
        calculation = 3; 
        textField.setText("");
        label.setText(number + "x");
    } else if (source == buttonDiv) {
        number = Double.parseDouble(textField.getText());
        calculation = 4; 
        textField.setText("");
        label.setText(number + "/");
    } else if (source == buttonMod) {
        number = Double.parseDouble(textField.getText()); 
        calculation = 100; 
        textField.setText(""); 
        label.setText(number + " % ");
    } else if (source == buttonEqual) {
        if (calculation == 100) { 
            double secondNumber;
            try {
                secondNumber = Double.parseDouble(textField.getText());
                answer = number % secondNumber;
                textField.setText(String.valueOf(answer));
            } catch (NumberFormatException ex) {
                textField.setText("Error");
            }
            label.setText(""); 
        } else {
            performCalculation(); 
            label.setText("");
        }
    } else if (source == buttonClear) {
        textField.setText("");
        label.setText("");
        number = 0;
    } else if (source == buttonDelete) {
        String currentText = textField.getText();
        if (currentText.length() > 0) {
            textField.setText(currentText.substring(0, currentText.length() - 1));
        }
    } else if (source == buttonSqrt) {
        double sqrtValue = Math.sqrt(Double.parseDouble(textField.getText()));
        textField.setText(String.valueOf(sqrtValue));
    } else if (source == buttonSquare) {
        double squareValue = Math.pow(Double.parseDouble(textField.getText()), 2);
        textField.setText(String.valueOf(squareValue));
    } else if (source == buttonLog) {
        double logValue = Math.log10(Double.parseDouble(textField.getText()));
        textField.setText(String.valueOf(logValue));
    } else if (source == buttonSin) {
        double sinValue = Math.sin(Math.toRadians(Double.parseDouble(textField.getText())));
        textField.setText(String.valueOf(sinValue));
    } else if (source == buttonAbs) {
        double absValue = Math.abs(Double.parseDouble(textField.getText()));
        textField.setText(String.valueOf(absValue));
    } else if (source == buttonFact) {
        int n = Integer.parseInt(textField.getText());
        textField.setText(String.valueOf(factorial(n)));
    }
}


private void performCalculation() {
    switch (calculation) {
        case 1 -> 
            answer = number + Double.parseDouble(textField.getText());
        case 2 -> 
            answer = number - Double.parseDouble(textField.getText());
        case 3 -> 
            answer = number * Double.parseDouble(textField.getText());
        case 4 ->
            answer = number / Double.parseDouble(textField.getText());
        case 5 -> 
            answer = number % Double.parseDouble(textField.getText()); 
    }
    textField.setText(String.valueOf(answer)); 
}




    
    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void enable() {
        textField.setEnabled(true);
        for (Component component : frame.getContentPane().getComponents()) {
            if (component instanceof JButton) {
                component.setEnabled(true);
            }
        }
    }

    public void disable() {
        textField.setEnabled(false);

        for (Component component : frame.getContentPane().getComponents()) {
            if (component instanceof JButton) {
                component.setEnabled(false);
            }
        }
    }
    public static void main(String[] args) {
        new CalculatorApplication();
    }


}
