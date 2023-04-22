import java.util.Scanner;

public class Algebric {

    public static void main(String[] args) {

        //(x2+y2 -|z|)3

//        int x = 2;
//        int y = 3;
//        int z = 4;
//        int result;

        Scanner sc = new Scanner(System.in);

        // ask user to enter numbers
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        System.out.println("Enter the value of z: ");
        int z = sc.nextInt();

        double result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

    }
}
