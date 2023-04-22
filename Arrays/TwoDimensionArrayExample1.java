package Arrays;

public class TwoDimensionArrayExample1 {

    public static void main(String[] args) {
        //declaration of 2-d array
        int a[][] = new int[3][2];

        //storing elements values into array
        a[0][0] = 10;
        a[0][1] = 20;

        a[1][0] = 30;
        a[1][1] = 40;

        a[2][0] = 50;
        a[2][1] = 60;

        //classic for loop
        //i representing rows , j represnting columns

        //concept here is : intially i(row) =0 which is true, i<=2 which is true , then control goes inside internal
        //for loop i.e j(column),j=0 which is true, j<=1 which is also true the it will print a[0][0]=10
        // then it will increment j++ so j becomes 1 then inner loop exist out,
        //

//        for (int i = 0; i <= 2; i++) { //forincrementing the rows
//
//            for (int j = 0; j <= 1; j++) { //for incrementing columns
//                System.out.println(a[i][j]);
//            }
//
//        }

        //for..each loop
        for(int i[]:a){
            for(int j:i){
                System.out.println(j+" ");
            }
            System.out.println();
        }

    }
}
