package Inheritancepkg;

class Bank{
    int getRateofInterest()
    {
     return 0;
    }
}
class SBI extends Bank{
    int getRateofInterest()  //overriden
    {
        return 10;
    }
}
class ICICI extends Bank{
    int getRateofInterest()
    {
        return 15;
    }
}
class Axis extends Bank{
    int getRateofInterest()
    {
        return 20;
    }
}


public class overridingExample {

    public static void main(String[] args) {
//        Bank bk = new Bank();
//        System.out.println(bk.getRateofInterest());

        SBI sbobj = new SBI();
        System.out.println(sbobj.getRateofInterest()); //10

        ICICI iciobj = new ICICI();
        System.out.println(iciobj.getRateofInterest());//15

        Axis axobj= new Axis();
        System.out.println(axobj.getRateofInterest());//20
    }
}
