package Arrays;

public class TwoDimensionArrayEample2 {

    public static void main(String[] args) {

        int a[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        for (int i[]:a){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
