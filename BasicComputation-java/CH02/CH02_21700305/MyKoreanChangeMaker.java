import java.util.Scanner;

public class MyKoreanChangeMaker {
    public static void main(String[] args) {
        int fiveH, oneH, ten, five, one, total, tmp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number from 1 to 10000");
        total = scanner.nextInt();
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

        System.out.println(total + " won in coins can be given as:");
        System.out.println(fiveH + " 500 won");
        System.out.println(oneH + " 100 won");
        System.out.println(ten + " 10 won");
        System.out.println(five + " 5 won");
        System.out.println(one + " 1 won");
    }
}
