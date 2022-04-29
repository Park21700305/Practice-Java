import java.util.Scanner;

public class CH03_MyCompareTo {
    public static void main(String[] args) {
        String s1;
        String s2;
        char yn;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Please input two words:");
            s1 = scanner.next();
            s2 = scanner.next();
            if(s1.compareTo(s2)<0){
                System.out.println(s1 + " is before " + s2);
            }
            else if(s1.compareTo(s2)>0){
                System.out.println(s1 + " is after " + s2);
            }
            else{
                System.out.println(s1 + " is same as " + s2);
            }
            System.out.println("Want to end the program??");
            System.out.println("Enter y for yes or n for no.");
            yn = scanner.next().charAt(0);
        }while(yn == 'y');
        System.out.println("end the program!!");
    }
}
