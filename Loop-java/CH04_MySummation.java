import java.util.Scanner;

public class CH04_MySummation {
    public static void main(String[] args) {
        System.out.println("Please input a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int total = 0;

        for(int i=0; i<num; i++){
            total += i+1;
        }

        System.out.println("The summation from 1 to 6 is");
        System.out.println(total);
    }
}
