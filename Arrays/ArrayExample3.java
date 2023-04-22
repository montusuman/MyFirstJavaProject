package Arrays;

public class ArrayExample3 {
    public static void main(String[] args) {
        //int a[] = new int[5]; //fixed we can not store many number of values
        int a[] = {1,2,3,4,5}; // we can store any numbers of elemets

        int sum = 0;
        for(int i=0;i<=5;i++){
            System.out.println(i);
            sum = sum+i;
            System.out.println(sum);
        }
    }
}
