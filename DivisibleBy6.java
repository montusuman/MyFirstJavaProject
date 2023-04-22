
//PRINT ALL THE NUMBERS DIVISIBLE BY 2 and 3 FROM 1 TO 200
public class DivisibleBy6 {

    public static void main(String[] args){
        for(int i =1; i<=200; i++){
            if(i%2==0 && i%3==0){
                System.out.println("Numbers divisible by 2 and 3 are: "+ i);
            }
        }
    }
}
