public class SwappingNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("value of a before swap: " + a);
        System.out.println("value of b before swap: " + b);

        //logic to swap
        //take one more variable c but only decalre

        int c;

        c = a; //c is 10
        a = b; //a is 20
        b = c; //b is 10

        System.out.println("value of a after swap: " + a);
        System.out.println("value of a after swap: " + b);
    }
}
