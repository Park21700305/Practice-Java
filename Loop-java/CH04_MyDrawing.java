import java.util.Scanner;

public class CH04_MyDrawing {
    public static void main(String[] args) {
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        int num = scanner.nextInt();
        for(i=1; i<=num; i++){
            for(j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=num; i>0; i--){
            for(j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
