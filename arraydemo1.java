import java.util.*;

public class arraydemo1
{
    public static void main(String args[])
    {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int []marks =new int[n];
        // taking inputs
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=scn.nextInt();
        }
        //displyaing outputs
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}