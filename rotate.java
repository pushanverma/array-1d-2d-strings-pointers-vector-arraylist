import java.util.*;

public class rotate {

    public static void rotateit(int []arr,int k)
    {

        int i=0;
        int j=arr.length-1;
        if(k>0)
        {

        }
        else
        {

        }
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        rotateit(arr,k);
    }
    
}
