public class SwitchCaseExamples {

    public static void main(String[] args) {

        //if day=1 print sunday otherwise break

        int days = 5;
        switch (days)
        {
            case 1:
                System.out.println("Today is Sunday");
                break;


            default:
                System.out.println("Invalid days");
                break;


        }
    }
}
