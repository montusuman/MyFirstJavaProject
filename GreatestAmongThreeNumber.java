public class GreatestAmongThreeNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        if(a>b && a>c)
        {
            System.out.println("a is greatest");
        }
        else if (b>c && b>a)
        {
            System.out.println("b is greatest");
        }
        else {
            System.out.println(c + " C is greatest among "+ a + " and "+ b);
        }
    }
}
