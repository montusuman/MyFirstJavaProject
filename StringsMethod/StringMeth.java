package StringsMethod;

public class StringMeth {
    public static void main(String[] args) {
        String s = "Welcome";
        System.out.println(s.length()); //numbers of character in string :7

        //concatenation

        String s1 ="welcome to ";
        String s2 ="Patna";

        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        //equals :for comparing strings, return type :boolean value

        String s3 ="WELCOME";
        String s4="welcome";
        System.out.println(s3.equals(s4)); //false

        //equalsignoreCase
        System.out.println(s3.equalsIgnoreCase(s4)); //true

        //contains
        System.out.println(s3.contains("WEL"));//TRUE
        System.out.println(s4.contains("c"));//true
        System.out.println(s3.contains("abc"));//false

        //substring
        System.out.println(s3.substring(0,3));
        System.out.println(s3.substring(2,5));
        System.out.println(s3.substring(4,7));
        System.out.println(s3.substring(0,7));

        //REPLACE()
        System.out.println(s4.replace('e','a'));
        System.out.println(s4.replace("come","know"));

    }
}
