//21700305 박지성
public class CH07_Matrix {
    public static void makeMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=i+j;
            }
        }
    }
    public static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
