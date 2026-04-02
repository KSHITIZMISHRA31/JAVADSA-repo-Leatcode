package org.LeatCode.prblms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SetMatrixZeroes {

    //=========================
    //Better Solution approach
    //=========================
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> xcol = new ArrayList<>();
        ArrayList<Integer> ycol = new ArrayList<>();
        for(int i=0 ;i<matrix.length;i++){
            for (int j=0; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
                if( matrix[i][j]==0){
                    xcol.add(i,1);
                    ycol.add(j,1);
                }
            }
            System.out.println();
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
        for(int i=0 ;i<matrix.length;i++){
            for (int j=0; j< matrix[i].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,0,1},{1,1,1,1},{1,1,1,1}};
        setZeroes(matrix);
    }
}
