package com.arraysort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" numbers:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arr));
    }
}
