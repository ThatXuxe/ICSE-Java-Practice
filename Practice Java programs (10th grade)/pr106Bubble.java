import java.util.*;
public class pr106Bubble//descending
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length: ");
      int[] arr = new int[sc.nextInt()];
      System.out.println("Enter the values: ");
      for(int i = 0; i < arr.length; i++)
      {
          arr[i] = sc.nextInt();
      }
      System.out.println("__________________________");
      for(int i = 0; i<arr.length; i++)
      {
    	  for(int j = 0; j<arr.length-1-i; j++)
    	  {
    		  if(arr[j]>arr[j+1])
    		  {
    			  int temp = arr[j];
    			  arr[j] = arr[j+1];
    			  arr[j+1] = temp;	  
    		  }
    	  }
      }
      for(int i = 0; i<arr.length; i++)
          System.out.println(arr[i]);
    }
}