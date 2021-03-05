/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arraydemo2
{
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn =new Scanner(System.in);
	    int n=scn.nextInt(); // taking no. of elements in arr
	    int []arr=new int[n];
	    for(int i=0;i<arr.length;i++)
	    { //entering elements 
	        arr[i]=scn.nextInt();
	    }
	    
	    swap(arr,0,4);
	    
	    for(int i=0;i<arr.length;i++)
	    { //display elements 
	        System.out.println(arr[i]);
	    }
	}
}

