import java.util.*;


public class diff1darray {
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n1=scn.nextInt();
        int []arr1=new int[n1];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=scn.nextInt();
        }        
        int n2=scn.nextInt();
        int []arr2=new int[n2];
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=scn.nextInt();
        }

        int []diff =new int[n1>n2?n1:n2];


    }
    
}
