package com.farrukhzaripov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        X x = new X(new Scanner(System.in));
        x.x();




        /*String varFour = "This is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        System.out.println("scopeCheck varOne is: "+scopeCheck.getVarOne());
        System.out.println(varFour);

        scopeCheck.timesTwo();
        System.out.println("**************************************");
        ScopeCheck.innerClass innerClass = scopeCheck.new innerClass();

        innerClass.timesTwo();

*/
    }
}