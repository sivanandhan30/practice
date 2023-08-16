package com.recursion;

import java.util.Scanner;

public class Fact {

    public static int fact(int n){
        int i=0;
        if(n==0)
            return 1;
        else
        return (n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        int c=fact(num);
        System.out.println("The factorial of "+num+" is: "+c);
    }
}
