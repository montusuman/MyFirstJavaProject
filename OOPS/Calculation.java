package OOPS;

public class Calculation {

    int a;
    int b;

    //1)method not taking any/empty parameter
    //4)
    // method may not have return type
//    void sum()
//    {
//        System.out.println(a+b);
//    }

    //2)method takes parameter
//    void sum(int x, int y)
//    {
//        a=x;
//        b=y;
//        System.out.println(a+b);
//    }

    //3)method returns some value/return type
    int sum(){
        return a+b;
    }

    public static void main(String[] args)
    {
        Calculation cal = new Calculation();
        //1)method not taking any/empty parameter
//        cal.a=100;
//        cal.b=200;
//        cal.sum();


        //2)method takes parameter
//        cal.sum(10,20);

        //3)method returns some value/return type
        cal.a=20;
        cal.b=20;
        int r = cal.sum();
        System.out.println(r);
    }
}
