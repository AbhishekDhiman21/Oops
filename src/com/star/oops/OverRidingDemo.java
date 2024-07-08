package com.star.oops;

class OverRiding{
    protected void printRam()
    {
        System.out.println("Ram ");
    }
}

class OverRidingTest extends OverRiding{
    protected void printRam() {
        System.out.println("Jai Siya Ram");
    }
}
public class OverRidingDemo {
    public static void main(String[] args) {
        OverRiding OverRiding=new OverRiding();
        OverRiding.printRam();
        OverRidingTest OverRidingTest=new OverRidingTest();
        OverRidingTest.printRam();
        OverRiding Test=new OverRidingTest();
        Test.printRam();
    }
}

