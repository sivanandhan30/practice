package com.regularexpression;

import javax.swing.*;
import java.util.regex.*;

public class RegularExpression {
    public static void main(String[] args) {
        String msg = "wFvLrl2xQjyrWrxeNI21@#9w";
        String s1=msg;
        s1 = s1.replaceAll("[^0-9]", "");
        System.out.println(s1);

        Pattern p2 = Pattern.compile("\\W+");
        Matcher m2 = p2.matcher(msg);

        while (m2.find()) {
            System.out.println(m2.group());
        }
    }
}
