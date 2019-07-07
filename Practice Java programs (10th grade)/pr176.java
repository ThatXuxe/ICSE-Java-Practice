import java.util.*;
/*
 */
public class pr176
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. of names: ");
      String[] arr = new String[sc.nextInt()];
      for(int i = 0; i<arr.length; i++)
      {
          System.out.print("Enter name: ");
          arr[i] = sc.next(); 
      }
      System.out.println("Enter search item: ");
      String s = sc.nextLine();
      System.out.println("______________________________________");
      System.out.println(BinarySearch(arr,s));      
    }
    public static boolean BinarySearch(String[] arr, String s)
    {
        int mid= (arr.length-1+0)/2, hi = arr.length-1, lo = 0;
        boolean flag = false;
        while(mid>lo)
        {
           mid = (hi + lo)/2;
           if(arr[mid].compareTo(s)<0)  
           {
               lo = mid+1;
           }
           else if(arr[mid].compareTo(s)>0)
           {
               hi = mid-1;
           }
           else if(arr[mid].compareTo(s)==0)
           {
               flag = true;
               break;
           }
        }
        return flag;
    }
}