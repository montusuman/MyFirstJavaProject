public class Array {


    public  static  void main(String[] args){
        int [] a = new int[3]; //fixed size
        a[0]=5;
        a[1]=6;
        a[2]=7;
        System.out.println(a[1]);

        int [] e = {1,2,3,4,5,6,7,8};
                //largest index is always 1 less than the length of an array
        //index always starts from 0
        //if u try to access elements that is out of the boundary, then it will throw an exception ArrayIndexOutOfBoundException

        System.out.println(e.length);
        int l = e.length;

        for(int i=0; i<l; i++){
            System.out.println(e[i]);
        }

    }

}
