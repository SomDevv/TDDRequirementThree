package com.Area;
public class Rectangle {
    double length;double breadth;double hypotenuse;
    protected double findArea_case1(double length,double breadth) {
        this.length = length;
        this.breadth = breadth;
        double ans = 0;
        if (length > 0 && breadth > 0) {
            ans = area_case1_1();
        } else if (length <= 0 || breadth <= 0) {
            ans = area_case1_2();
        }
        System.out.println("Area of the rectangle is " + ans);
        return ans;
    }
    protected double findArea_case2(double length,double hypotenuse){
        this.length=length;
        this.hypotenuse=hypotenuse;
        breadth=Math.sqrt((hypotenuse*hypotenuse)-(length*length));
        System.out.println("Area of rectangle is "+Math.abs(breadth*length));
        return ( (breadth*length) > 0 ) ? (breadth*length) : (-breadth*length);
    }
    private double area_case1_1(){
        double ans=length*breadth;
        return ans;
    }
    private double area_case1_2(){
        double ans=1;
        if (length<=0 && breadth<=0) ans= length*breadth;
        else ans=-length*breadth;
        return ans;
    }
}
