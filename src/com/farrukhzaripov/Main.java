package com.farrukhzaripov;

public class Main {
    public static void main(String[] args) {

        ScopeCheck scopeCheck = new ScopeCheck();

        scopeCheck.timesTwo();
        System.out.println("**************************************");
        ScopeCheck.innerClass innerClass = scopeCheck.new innerClass();

        innerClass.timesTwo();


    }
}