import java.util.*;


public class findelement {

    public static void find(int []arr,int choice)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(choice==arr[i])
            {
                System.out.println("element found at ="+(i+1));
            }
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
        int choice;
        System.out.println("\nenter choice =");
        choice =scn.nextInt();
        find(arr,choice);
    }
    
}
