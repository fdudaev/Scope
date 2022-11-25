package com.farrukhzaripov;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 1; x < 11; x++){
            System.out.println(x + " * " + this.x + " = " + x * this.x);
        }
    }

}
