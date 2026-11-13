
import java.util.Scanner;
class matrixall{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row1,col1;
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];

    
        for(int i = 0 ; i < row1 ; i++){
            for(int j = 0 ; j < col1 ; j++){
            arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < row2 ; i++){
            for(int j = 0 ; j < col2 ; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("addition");
        int[][] sum = new int[row1][col1];
        for(int i = 0 ; i < row1 ; i++){
            for(int j = 0 ; j < col1 ; j++){
            sum[i][j] = arr1[i][j] + arr2[i][j];
        }
        for(int i = 0 ; i < row1 ; i++){
            for(int j = 0 ; j <col1 ; j++){
                
            }
        }


    }

        }
    



        

    }
}