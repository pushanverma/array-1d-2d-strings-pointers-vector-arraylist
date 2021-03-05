import java.util.*;

public class reverse {

    public static void main(String[] args)
    {
        Scanner scn =new Scanner (System.in);

        int n=scn.nextInt();
        float []arr=new float[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextFloat();
        }
        System.out.println("Reversing array-");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    
}
