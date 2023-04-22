package Inheritancepkg;

class A{ //super class
     int a;
     int b;
     void display(){
         System.out.println(a+b);
     }
}

class  B extends A{ //child class

    int x;
    int y;
    void show(){
        System.out.println(x+y);
    }
}
class C extends B{ //child class
    int p;
    int q;
    void addition(){
        System.out.println(p+q);
    }
}


public class Test1 {
    public static void main(String[] args) {

//        A obj1 = new A();
//        obj1.a=5;
//        obj1.b=6;
//        obj1.display();

//        B obj2 = new B();
//        obj2.x=10;
//        obj2.y=20;
//        obj2.show();
//
//        obj2.a=10;
//        obj2.b=10;
//        obj2.display();

        C obj3 = new C();
        obj3.a=1;
        obj3.b=2;
        obj3.p=4;
        obj3.q=5;
        obj3.x=6;
        obj3.y=7;
        obj3.show();
        obj3.addition();
        obj3.display();
    }
}
