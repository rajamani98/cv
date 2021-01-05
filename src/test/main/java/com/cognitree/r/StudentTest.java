package com.cognitree.r;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll:");
        int roll=sc.nextInt();
        Student s=new Student(roll);
        s.display();
    }
}