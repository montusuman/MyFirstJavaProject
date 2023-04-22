package interfacespkg;


final class Test{
    final int a=10;


    final void m1(){
        //a=20; //not valid bcz a is final variable
        System.out.println(a);
    }
}

//class Test1 extends Test{ //not valid bcz class is final
    //void m1(){ //not valid bcz method is final method
//        System.out.println("m1 is overridden");
//    }
//}

public class finalExample {
    public static void main(String[] args) {

    }
}
