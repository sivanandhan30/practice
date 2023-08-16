package com.rank;

import java.util.Arrays;

public class RankLogic {
    public static void main(String[] args) {
        Student s1=new Student(1001,70,95,90,0);
        Student s2=new Student(1002,97,80,95,0);
        Student s3 =new Student(1003,80,90,98,0);
        s1.totalCalc();
        s2.totalCalc();
        s3.totalCalc();

        if(s1.mark1>s2.mark1 && s1.mark1>s3.mark1){
            System.out.println("For Sub1 RegisterNo:"+s1.regNo+" is 1st rank");
        }
        else if(s2.mark1>s1.mark1 && s2.mark1>s3.mark1){
            System.out.println("For Sub1 RegisterNo:"+s2.regNo+" is 1st rank");
        }
        else{
            System.out.println("For Sub1 RegisterNo:"+s3.regNo+" is 1st rank");
        }

        if(s1.mark2>s2.mark2 && s1.mark2>s3.mark2){
            System.out.println("For Sub2 RegisterNo:"+s1.regNo+" is 1st rank");
        }
        else if(s2.mark2>s1.mark2 && s2.mark2>s3.mark2){
            System.out.println("For Sub2 RegisterNo:"+s2.regNo+" is 1st rank");
        }
        else{
            System.out.println("For Sub2 RegisterNo:"+s3.regNo+" is 1st rank");
        }

        if(s1.mark3>s2.mark3 && s1.mark3>s3.mark3){
            System.out.println("For Sub3 RegisterNo:"+s1.regNo+" is 1st rank");
        }
        else if(s2.mark3>s1.mark3 && s2.mark3>s3.mark3){
            System.out.println("For Sub3 RegisterNo:"+s2.regNo+" is 1st rank");
        }
        else{
            System.out.println("For Sub3 RegisterNo:"+s3.regNo+" is 1st rank");
        }
    }
}
