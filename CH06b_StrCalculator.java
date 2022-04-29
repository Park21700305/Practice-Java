//21700305 박지성
public class CH06b_StrCalculator {
    private String a, b;
    private char op;
    private int num1, num2;
    private double num3, num4;

    public static double operation(String a, char op, String b) {
        if (op == '+')
            return (Integer.parseInt(a) + Integer.parseInt(b));
        else if (op == '-')
            return (Integer.parseInt(a) - Integer.parseInt(b));
        else {
            System.out.println("The only possible operation is '+' or 'b'");
            return 0;
        }
    }

    public static double operation(int a, char op, int b) {
        if (op == '+')
            return a+b;
        else if (op == '-')
            return a-b;
        else {
            System.out.println("The only possible operation is '+' or 'b'");
            return 0;
        }
    }

    public static double operation(double a, char op, double b) {
        if (op == '+')
            return a+b;
        else if (op == '-')
            return a-b;
        else {
            System.out.println("The only possible operation is '+' or 'b'");
            return 0;
        }
    }

}
