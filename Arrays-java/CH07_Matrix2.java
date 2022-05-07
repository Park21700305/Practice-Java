//21700305 박지성
public class CH07_Matrix2 {
    public static void makeMatrix2(int arr[][]){
        int num=1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = num++;
            }
        }
    }
    public static void addition(int arr1[][], int arr2[][]){
        int arr3[][] = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Matrix addtion is ..");
        for(int k=0; k<arr3.length; k++){
            for(int l=0; l<arr3[k].length; l++){
                System.out.print(arr3[k][l] + " ");
            }
            System.out.println();
        }
    }
    public static void subtraction(int arr1[][], int arr2[][]){
        int arr3[][] = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr3[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        System.out.println("Matrix subtraction is ..");
        for(int k=0; k<arr3.length; k++){
            for(int l=0; l<arr3[k].length; l++){
                System.out.print(arr3[k][l] + " ");
            }
            System.out.println();
        }
    }
    public static void multiplication(int arr1[][], int arr2[][]){
        int arr3[][] = new int[arr1.length][arr1[0].length];
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr2[0].length; j++){
                    arr3[i][j]=0;
                    for(int k=0; k<arr1[0].length; k++){
                        arr3[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
        System.out.println("Matrix multiplication is ..");
        for(int l=0; l<arr3.length; l++){
            for(int m=0; m<arr3[l].length; m++){
                System.out.print(arr3[l][m] + " ");
            }
            System.out.println();
        }
    }

}
