package org.LeatCode.prblms.Math;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                res[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                matrix[i][j]=res[i][res[i].length-1-j];
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);

    }
//    matrix = [[1,2,3],[4,5,6],[7,8,9]]
//    Output: [[7,4,1],[8,5,2],[9,6,3]]

//    matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//    Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
}
