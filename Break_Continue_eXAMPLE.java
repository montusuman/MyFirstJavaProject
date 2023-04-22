public class Break_Continue_eXAMPLE {

    public static void main(String[] args)
    {

        for(int i=1; i<=10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i);
//output : 1,2,3,4 : whenever i value become 5 it will break out the loop nothing will perform
        }

        //continue
        for(int i=1; i<=10;i++)
        {
            if(i==5)
            {
                continue;
            }
              System.out.println(i);

        //output : 1,2,3,4,6,7,8,9 : whenever i value become 5 it will skip to print 5 because it saying
        //continue to print next number.
        }
    }
}
