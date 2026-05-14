package org.LeatCode.prblms.String;

public class ExcelSheetColumnTitle {
    public static StringBuilder convertToTitle(int columnNumber) {
        StringBuilder val = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char ch = (char) ('A' + (columnNumber % 26));
            val.append(ch);
            columnNumber=(int) columnNumber/26;
        }

        return val.reverse();
    }

    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }
}
