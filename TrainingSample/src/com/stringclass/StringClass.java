package com.stringclass;

public class StringClass {
    public static void main(String[] args) {
        String msg = "  Hi,How are you?";
        String msg2 = "Hi,Siva";
        System.out.println(msg.toUpperCase());
        System.out.println(msg.charAt(10));
        System.out.println(msg.contains("How"));
        System.out.println(msg.matches(msg2));
        System.out.println(msg.strip());
    }
}
