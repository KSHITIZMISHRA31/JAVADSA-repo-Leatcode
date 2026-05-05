package org.LeatCode.prblms.Array;

public class ToeplitzMatrix {
    /// 00,01,02,03
    /// 10,11,12,13
    /// 20,21,22,23

    public static boolean isToeplitzMatrix(int[][] matrix) {

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i =0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
                System.out.print(matrix[i][j]+" "+matrix[i+1][j+1]+" ,");
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
            System.out.println();
        }

        return true;
    }
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] matrix = {{1,2},{2,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
