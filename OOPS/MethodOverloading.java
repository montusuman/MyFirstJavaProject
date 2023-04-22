package OOPS;

public class MethodOverloading {

    int a =10;
    int b=20;

    void sum(){
        System.out.println(a+b);
    }
    void sum(int x, int y){
        int a=x;
        int b=y;
        System.out.println(x+y);
    }
    void sum(int x,int y, int z){
        System.out.println(x+y+z);
    }
    void sum(int x, double y){
        System.out.println(x+y);
    }


    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.sum();
        mo.sum(100,200);
        mo.sum(1,2,3);
        mo.sum(10,10.52);
    }
}
