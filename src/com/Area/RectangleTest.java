package com.Area;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {

    @Test
    void test1() {
        Rectangle obj=new Rectangle();    //12,2 output->24
        assertEquals(24,obj.findArea_case1(12,2));
    }
    @Test
    void test2(){
        Rectangle obj=new Rectangle();   //-12,-2 or 12,-2 or -12,2 output->24
        assertEquals(24,obj.findArea_case1(12,-2));
    }
    @Test
    void test3(){
        Rectangle obj=new Rectangle();
        assertEquals(60,obj.findArea_case2(12,13));
    }
    @Test
    void test4(){
        Rectangle obj=new Rectangle();
        assertEquals(60,obj.findArea_case2(-12,-13));
    }
}