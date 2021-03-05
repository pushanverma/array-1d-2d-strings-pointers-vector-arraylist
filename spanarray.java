import java.util.*;

public class spanarray {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        //entering elements
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        //finding max
        int max =arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max= arr[i];
            }
        }
        //finding min
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        //
        int span =max-min;
        System.out.println("Span->"+max+"-"+min+"="+span);
    }
    
}
