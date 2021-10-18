package sample;
abstract class Bank{        //parent class
    abstract int getRateOfInterest();
}

//hello world
//****************
//----------
//final commit

class Axis extends Bank{    //child1
    int getRateOfInterest(){return 9;}
}
class SCB extends Bank{     //child2
    int getRateOfInterest(){return 7;}
}
class TestBank{
    public static void main(String args[]){
        Bank b;
        b=new Axis();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new SCB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }}
/*public class abstraction {
    public static void main(String[] args) {
        TestBank obj=new TestBank();
    }


    //i am fed of master writing new message all the time !!!!
    //so what to do?


    //yes i have used git pull
    //now what
}*/
