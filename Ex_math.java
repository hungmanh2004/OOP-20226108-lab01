import javax.swing.JOptionPane;

public class Ex_math {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Sum: ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        strNotification += (num1 + num2) + "\nDifference: " + (num1 - num2) + "\nProduct: " + (num1 * num2) + "\nQuotient: " + (num1 / num2);

        JOptionPane.showMessageDialog(null, strNotification, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
