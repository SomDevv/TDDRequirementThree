package com.Area;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double length;double breadth;double hypotenuse;
        Scanner scan=new Scanner(System.in);
        Rectangle rect=new Rectangle();
        System.out.println("Enter you choice");
        System.out.println("1:Find area given length and breadth");
        System.out.println("2:Find area given length/breadth and hypotenuse ");
        int i=scan.nextInt();
        if (i==1){System.out.println("Enter you length and breadth");
            length=scan.nextDouble();
            breadth=scan.nextDouble();
            rect.findArea_case1(length,breadth);}
        else if (i==2){System.out.println("Enter you length/breadth and hypotenuse of rectangle");
            length=scan.nextDouble();
            hypotenuse=scan.nextDouble();
            rect.findArea_case2(length,hypotenuse);
        }
    }
}
