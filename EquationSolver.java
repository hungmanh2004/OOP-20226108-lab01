import javax.swing.JOptionPane;

public class EquationSolver {

    public static void main(String[] args) {
        // First-Degree Equation with One Variable (ax + b = 0)
        String strA1, strB1;
        strA1 = JOptionPane.showInputDialog(null, "Please input a: ", "ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
        double a1 = Double.parseDouble(strA1);

        strB1 = JOptionPane.showInputDialog(null, "Please input b: ", "ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
        double b1 = Double.parseDouble(strB1);

        String result1 = solveFirstDegreeEquation(a1, b1);
        JOptionPane.showMessageDialog(null, result1, "Result", JOptionPane.INFORMATION_MESSAGE);

        // System of First-Degree Equations with Two Variables
        String strA11, strA12, strB2, strA21, strA22, strB3;
        strA11 = JOptionPane.showInputDialog(null, "Please input a11: ", "a11*x1 + a12*x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        double a11 = Double.parseDouble(strA11);

        strA12 = JOptionPane.showInputDialog(null, "Please input a12: ", "a11*x1 + a12*x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        double a12 = Double.parseDouble(strA12);

        strB2 = JOptionPane.showInputDialog(null, "Please input b1: ", "a11*x1 + a12*x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        double b2 = Double.parseDouble(strB2);

        strA21 = JOptionPane.showInputDialog(null, "Please input a21: ", "a21*x1 + a22*x2 = b2", JOptionPane.INFORMATION_MESSAGE);
        double a21 = Double.parseDouble(strA21);

        strA22 = JOptionPane.showInputDialog(null, "Please input a22: ", "a21*x1 + a22*x2 = b2", JOptionPane.INFORMATION_MESSAGE);
        double a22 = Double.parseDouble(strA22);

        strB3 = JOptionPane.showInputDialog(null, "Please input b2: ", "a21*x1 + a22*x2 = b2", JOptionPane.INFORMATION_MESSAGE);
        double b3 = Double.parseDouble(strB3);

        String result2 = solveSystemOfFirstDegreeEquations(a11, a12, b2, a21, a22, b3);
        JOptionPane.showMessageDialog(null, result2, "Result", JOptionPane.INFORMATION_MESSAGE);

        // Second-Degree Equation with One Variable (ax^2 + bx + c = 0)
        String strA2, strB4, strC;
        strA2 = JOptionPane.showInputDialog(null, "Please input a: ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        double a2 = Double.parseDouble(strA2);

        strB4 = JOptionPane.showInputDialog(null, "Please input b: ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        double b4 = Double.parseDouble(strB4);

        strC = JOptionPane.showInputDialog(null, "Please input c: ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(strC);

        String result3 = solveSecondDegreeEquation(a2, b4, c);
        JOptionPane.showMessageDialog(null, result3, "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    // Method to solve First-Degree Equation with One Variable (ax + b = 0)
    public static String solveFirstDegreeEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "Infinite solutions.";
            } else {
                return "No solution.";
            }
        } else {
            double x = -b / a;
            return "Solution: x = " + x;
        }
    }

    // Method to solve System of First-Degree Equations with Two Variables
    public static String solveSystemOfFirstDegreeEquations(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a12 * a21;
        double Dx = b1 * a22 - b2 * a12;
        double Dy = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                return "Infinite solutions.";
            } else {
                return "No solution.";
            }
        } else {
            double x1 = Dx / D;
            double x2 = Dy / D;
            return "Solution: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    // Method to solve Second-Degree Equation with One Variable (ax^2 + bx + c = 0)
    public static String solveSecondDegreeEquation(double a, double b, double c) {
        if (a == 0) {
            return solveFirstDegreeEquation(b, c);
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "No real roots.";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Double root: x = " + x;
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            return "Two roots: x1 = " + x1 + ", x2 = " + x2;
        }
    }
}
