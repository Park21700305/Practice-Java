import java.util.Scanner;

public class CH04_MyLargeSmallAverage {
    public static void main(String[] args) {
        int num, small, large, count=0;
        double total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program allows you to enter a list" +
                "of positive integers\n(terminated by a -1) then displays the largest value.\n" +
                "smallest value. and average of the list of numbers.\n"+"not including the final" +
                " (negative) value that end the list\n");
        System.out.println("Please enter positive integer. or -1 to quit.");
        num = scanner.nextInt();
        if(num == -1) {
            System.out.println("nothing you entered");
            System.exit(0);
        }
        large = num;
        small = num;
        total += num;
        count++;
        while(true){
            System.out.println("Please enter positive integer. or -1 to quit.");
            num = scanner.nextInt();
            if(num == -1) break;

            if(num >= large) large = num;

            if(num <= small) small = num;

            total += num;
            count++;
        }
        System.out.println("For the "+count+" numbers you entered");
        System.out.println("the largest value = "+large);
        System.out.println("the smallest value = "+small);
        System.out.println("and the average is = "+total/count);
    }
}
