package com.farrukhzaripov;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = "+publicVar+": privateVar = "+privateVar);
    }
    public int getPrivateVar(){
        return privateVar;
    }
    public void timesTwo(){
        int privateVar = 2;
        for (int i = 1; i < 10; i++){
            System.out.println(i +" multiplied by two is = "+i*privateVar);
        }
    }
    public class innerClass{
        private int privateVar = 3;

        public innerClass(){
            System.out.println("InnerClass created, privateVar is: " + privateVar);
        }

        public void timesTwo(){
            //ScopeCheck.this.timesTwo();  // we can call timesTwo() method from outerClass
            //ScopeCheck.this.privateVar = 5;  // we can call privateVar field from outerClass and set new value;
            for (int i = 1; i < 10; i++){
                System.out.println(i +" multiplied by two is = "+i* ScopeCheck.this.privateVar); // using privateVar = 1; field from ScopeCheck class
            }
        }

    }

}
