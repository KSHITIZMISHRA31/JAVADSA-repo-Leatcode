package org.LeatCode.prblms.Math;

public class AddDigits {
    public static int addnum(int num){
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = (int) num/10;
        }
        return sum;
    }
    public static int addDigits(int num) {
        while(num>9){
            num = addnum(num);
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}
