package Arrays;

public class ArrayExample4 {
    public static void main(String[] args) {

        Object a[]= new Object[5];

        a[0]=10;
        a[1]="suman";
        a[2]=10.02;
        a[3]='S';
        a[4]=true;

        for(Object i:a){
            System.out.println(i);
        }
    }
}
