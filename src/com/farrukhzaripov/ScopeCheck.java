package com.farrukhzaripov;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;  // this can be in scope for entire class

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }
    public void useInner(){
        innerClass innerClass = new innerClass();
        System.out.println("varThree from outer class: "+ innerClass.varThree);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 1; i < 4; i++) {
            System.out.println(i + " multiplied by two is = " + i * varTwo);
        }
    }

    public class innerClass {
        private int varThree = 3;

        public innerClass() {
            System.out.println("InnerClass created, varOne " + "and varThree is: " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still here: " + varOne);
            //ScopeCheck.this.timesTwo();  // we can call timesTwo() method from outerClass
            //ScopeCheck.this.varOne = 5;  // we can call varOne field from outerClass and set new value;
            for (int i = 1; i < 4; i++) {
                System.out.println(i + " multiplied by two is = " + i * varThree); // using ScopeCheck.this.varOne = 1; field from ScopeCheck class
            }
        }

    }

}
