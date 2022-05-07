import javax.swing.*;
import java.util.Scanner;

public class MyKoreanChangeMakerWindow {
    public static void main(String[] args) {
        int fiveH, oneH, ten, five, total, one, tmp;
        Scanner scanner = new Scanner(System.in);
        String total1 = JOptionPane.showInputDialog("Enter a whole number from 1 to 10000","");
        total = Integer.parseInt(total1);
        while(!(total >= 1 && total <= 10000)){
            System.out.println("Please try again (ranges: 1~10000)");
            total = scanner.nextInt();
        }
        tmp = total;
        fiveH = tmp/500;
        tmp = tmp%500;
        oneH = tmp/100;
        tmp = tmp%100;
        ten = tmp/10;
        tmp = tmp%10;
        five = tmp/5;
        tmp = tmp%5;
        one= tmp;

        JOptionPane.showMessageDialog(null,total + " won in coins can be given as:\n"+
                fiveH + " 500 won\n" + oneH + " 100 won\n" + ten + " 10 won\n" + five + " 5 won\n" + one + " 1 won");
    }
}
