package org.LeatCode.prblms.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> subArr = new ArrayList<>();
            for(int j=0;j < i+1;j++){
                if(j==0 || j==i){
                    subArr.add(1);
                }
                else{
                    subArr.add(ls.get(i-1).get(j-1)+ls.get(i-1).get(j));
                }
            }
            ls.add(subArr);
        }
        return ls;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> lList = new ArrayList<>();
        lList = generate(numRows);
        for(int i = 0;i<lList.size();i++){
            for(int j = 0;j<lList.get(i).size();j++){
                System.out.print(lList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
