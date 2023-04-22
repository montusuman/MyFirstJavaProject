public class Test2 {
    public static void main(String[] args){
        //int a = 5;
       // String b = "Testing";
       // String c = "Check";

        //System.out.println(a + b);
        //System.out.println(a+"5");
        //System.out.println("Hi " + b + " Mini Bytes "+ c + " my channel");

        //if- else condition

        //int x = 9;
        //int y = 5;
        //int z = 8;

//        if(x==10){
//            System.out.println(y+z);
//        }
//        if(x!=10){
//            System.out.println(y*z);
//        }

        // some practice on if,elseif,else block

        int a1 = 5;
        int b1 = 10;
        int c1 = 15;
        boolean d = a1==5;

        //if a1 is equal to 5, then perform addition of b1 and c1
        //if a1 is equal to 10, then perform addition of a1 and c1
        //if a1 is equal to 15, then perform subtraction of a1 and c1
        //if a1 is nethier 5 nor 10 then perform multiplication

        if(a1==7)
        {
            System.out.println(b1+c1);
        }
        else if (d || b1==8)
        {
            System.out.println(a1+b1);
        } else if (a1==10)
        {
            System.out.println(a1+c1);
        }
        else if (a1==15)
        {
            System.out.println(a1-c1);
        }
        else
        {
            System.out.println(b1*c1);
        }

//assignemet1 :write a program to find the largest of 3 numbers
    }
}
