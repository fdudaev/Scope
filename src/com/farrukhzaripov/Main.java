package com.farrukhzaripov;

public class Main {
    public static void main(String[] args) {

        String varFour = "This is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        System.out.println("scopeCheck varOne is: "+scopeCheck.getVarOne());
        System.out.println(varFour);

        scopeCheck.timesTwo();
        System.out.println("**************************************");
        ScopeCheck.innerClass innerClass = scopeCheck.new innerClass();

        innerClass.timesTwo();


    }
}