import java.util.Scanner;
import java.lang.Integer;

public class My4BitBinaryToDigit {
    public static void main(String[] args) {
        System.out.println("Enter a four bit binary value.");
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();
        binary = binary.substring(0,4);
        int value = Integer.parseInt(binary,2);

        System.out.println("The value of "+ binary + " is " + value);

    }
}
