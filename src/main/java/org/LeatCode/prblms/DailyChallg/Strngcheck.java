package org.LeatCode.prblms.DailyChallg;

public class Strngcheck {

    public static void main(String[] args) {

        String st1 = "Hello";
        String st5 = "Hello";
        String st2 = new String("Hello1");
        StringBuilder st3 = new StringBuilder("Hello2");
        StringBuffer st4 = new StringBuffer("Hello3");



        System.out.println(st1.hashCode()+" : "+st5.hashCode()+" : "+st3.hashCode());

        st1 += "new";
        st3.append("xyz");
        System.out.println(st1.hashCode()+" : "+st5.hashCode()+" : "+st3.hashCode());
        System.out.println(st1+" : "+st2+" : "+st3+" : "+st4);

    }
}
