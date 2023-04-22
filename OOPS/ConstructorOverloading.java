package OOPS;

public class ConstructorOverloading {

    int a=0;
    int b=0;
    double c=0;

    ConstructorOverloading(){
        a=10;
        b=20;
        c=30.20;
    }
    ConstructorOverloading(int x, int y){
        a=x;
        b=y;
    }
    ConstructorOverloading(int x, int y,int z){
        a=x;
        b=y;
        c=z;
    }
    ConstructorOverloading(int x, int y, double z){
        a=x;
        b=y;
        c=z;
    }
    ConstructorOverloading(int x, double y, int z){
        a=x;
        c=y;

    }
    ConstructorOverloading(int x, double z){
        a=x;
        c=z;

    }

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }



    public static void main(String[] args) {

        //ConstructorOverloading co = new ConstructorOverloading(); //first constructor called
        //ConstructorOverloading co = new ConstructorOverloading(5,6); //second constructor called
        //ConstructorOverloading co = new ConstructorOverloading(5,6,8); //third constructor called
        //ConstructorOverloading co = new ConstructorOverloading(5,6.0); //fifth constructor called

        ConstructorOverloading co = new ConstructorOverloading(10,1502.0); //fourth constructor called
        co.display();

    }

}
