package Inheritancepkg;



class Vehicle{
    void run(){
        System.out.println("vehicle is running.......");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running........");
    }
}
public class overridingExample2 {
    public static void main(String[] args) {
        Bike bk = new Bike();
        bk.run();

//        Vehicle vc = new Vehicle();
//        vc.run();

    }
}
