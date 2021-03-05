import java.util.*;

public class reversearray {

    public static void reverse(int[]arr)
    {
        int i=0;
        int j=arr.length-1;
        System.out.println("\nprinting in reverse ->");
        while(i<j)
        {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
            
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.println(arr[k]);
        }
        
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        reverse(arr);
    }
    
}
