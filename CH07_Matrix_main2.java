public class CH07_Matrix_main2 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        CH07_Matrix2.makeMatrix2(A);
        CH07_Matrix.makeMatrix(B);
// Print A, B, C
        System.out.println("\nMatrix A is ..");
        CH07_Matrix.printMatrix(A);
        System.out.println("\nMatrix B is ..");
        CH07_Matrix.printMatrix(B);
        CH07_Matrix2.addition(A,B);
        CH07_Matrix2.subtraction(A,B);
        CH07_Matrix2.multiplication(A,B);
    }
}