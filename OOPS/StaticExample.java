package OOPS;

public class StaticExample {

    int a; //non static
    static int b; //static

    static void m1(){ //static method
        System.out.println("this m1 is - static method");
    }

    void m2(){ //non static method
        System.out.println("this m1 is - non static method");
    }
    void m3() { //non static method
        b=15; //static
        a=1500; //non static
        System.out.println(b);
        System.out.println(a);

        m1(); //static
        m2(); //nonstatic
    }

    public static void main(String[] args) {  //static method
        b=100; //accessible directly, bcz it is static variable,no need to create an object
        System.out.println(b);
        m1(); //accessible directly, bcz it is static method, no need to create an object

        //a=200; //not accessible bcz it is non static variable, but, it can be access through object
        //m2(); //not accessible bcz it is non static method, but, it can be access through object

        StaticExample se = new StaticExample();
        se.a=200;
        System.out.println(se.a);
        se.m2();
        se.m3();
    }

}
