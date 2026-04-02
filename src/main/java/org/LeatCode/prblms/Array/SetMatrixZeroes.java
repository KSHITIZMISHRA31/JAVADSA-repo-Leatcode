package org.LeatCode.prblms.Array;

import java.util.ArrayList;

public class SetMatrixZeroes {

    //=========================
    //Better Solution approach
    //=========================
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> xcol = new ArrayList<>();
        ArrayList<Integer> ycol = new ArrayList<>();
        for(int i=0 ;i<matrix.length;i++){
            for (int j=0; j< matrix[i].length ; j++){
                if( matrix[i][j]==0){
                    xcol.add(i);
                    ycol.add(j);
                }
            }
        }
        for(int i : xcol){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=0;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j : ycol){
                matrix[i][j]=0;
            }
        }

    }

    public static void optSetZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if first row has zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set zeroes based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero out first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero out first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        for(int i=0 ;i<matrix.length;i++){
            for (int j=0; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //to use better approach unclomment this function
        //setZeroes(matrix);
        optSetZeroes(matrix);
        for(int i=0 ;i<matrix.length;i++){
            for (int j=0; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
