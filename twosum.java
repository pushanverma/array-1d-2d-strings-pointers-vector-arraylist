import java.util.*;

public class twosum {
    
    public static void twosum(int[] nums, int target)
     {
        int a=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(a+nums[i]==target)
            {
                
            }
        }
        
    }

    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("\nenter no.=");
        n=scn.nextInt();
        int []nums =new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scn.nextInt();
        }
        int target;
        System.out.println("\nenter target=");
        target=scn.nextInt();
        twosum(nums,target);   
    }
}