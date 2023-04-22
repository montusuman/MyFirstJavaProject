import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {
        //Take input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);

        sc.close();
    }
}
