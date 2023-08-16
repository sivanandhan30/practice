package com.abstraction;

public class main extends Abstraction {
    public static void main(String[] args) {
        Abstraction a =new main();
        a.registration();
        a.verification();
    }

    @Override
    public void verification() {
        System.out.println("Verified Successfully");
    }
}
