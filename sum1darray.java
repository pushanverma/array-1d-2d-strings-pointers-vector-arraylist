import java.util.*;

public class sum1darray {
    
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n1 =scn.nextInt();
        int n2=scn.nextInt();
        int []arr1=new int[n1];
        int []arr2=new int[n2];
        
        // entering 1st array :
        System.out.println("Enter 1st array-");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=scn.nextInt();
        }
        //enter 2nd array :
        System.out.println("\nEnter 2nd aray-");
        for(int j=0;j<arr2.length;j++)
        {
            arr2[j]=scn.nextInt();
        }
        //deciding size for sum:
        int []sum=new int[n1>n2?n1:n2];
        
      //intializing i,j,k for 3 arrayas:
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        int c=0; //c is carry
        while(k>=0) //jab tak sum aa rha h tab tak chalo
        {
            int d=c; //kuch na mile to carrry hi daal do sum mei (digit mei)
            //d -is for digit
            if(i>=0)
            {
                d+=arr1[i];
            }
            if(j>=0)
            {
                d+=arr2[j];
            }
            //jab sab kuch  d mei add kar liya to fir c ko chota karna hoga 
            c=d/10;
            d=d%10;

            //dumping values into sum array :-
            sum[k]=d;


            //decreasing value of i,j,k:-
            i--;
            j--;
            k--;
        }
        System.out.println("result-");
      if(c!=0)
      {
          System.out.println(c);
      }

      for(int val: sum)
      {
          System.out.println(val);
      }
         
    }
}
