package org.LeatCode.prblms.String;

public class AddBinary {

    public static String addBinary(String a, String b){
            StringBuilder output = new StringBuilder();
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0 || carry == 1) {
                int sum = carry;
                if (i >= 0) {
                    sum += a.charAt(i) - '0';
                    i--;
                }
                if (j >= 0) {
                    sum += b.charAt(j) - '0';
                    j--;
                }
                output.append(sum % 2);
                carry = sum / 2;
            }
            return output.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }
}
