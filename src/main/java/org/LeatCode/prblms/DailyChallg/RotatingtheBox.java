package org.LeatCode.prblms.DailyChallg;

import java.util.Arrays;

public class RotatingtheBox {

    public static char[] sort(char[] val){
        int empty = val.length - 1;
        for(int i = val.length - 1; i >= 0; i--){
            if(val[i] == '*'){
                empty = i - 1;
            }
            else if(val[i] == '#'){
                val[i] = '.';
                val[empty] = '#';
                empty--;
            }
        }
        return val;
    }

    public static char[][] rotateTheBox(char[][] boxGrid) {
        char[][] res = new char[boxGrid[0].length][boxGrid.length];
        for(int i = 0 ; i < boxGrid.length ; i++){
            boxGrid[i] = sort(boxGrid[i]);
        }
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        for(int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - 1 - i] = boxGrid[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char[][] boxGrid = {{'#','#','*','.','*','.'},{'#','#','#','*','.','.'},{'#','#','#','.','#','.'}};
        char[][] res = rotateTheBox(boxGrid);
        for(char[] i: res){
            for(char j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
