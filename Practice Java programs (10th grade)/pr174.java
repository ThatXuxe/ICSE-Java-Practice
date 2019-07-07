import java.util.*;
import java.io.*;
/*
 */
public class pr174
{
    public static void main(String args[])throws IOException
    {
      Scanner sc = new Scanner(System.in);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter no. of names: ");
      String[] arr = new String[sc.nextInt()];
      for(int i = 0; i<arr.length; i++)
      {
          System.out.print("Enter a name: ");
          arr[i] = br.readLine();
      }
      System.out.println("Enter search item: ");
      String s = sc.next();
      System.out.println("______________________________________");
      sort(arr,s);
    }
    public static void sort(String arr[], String s)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                String temp = "";
                if(arr[i].compareTo(arr[j])>0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(BinarySearch(arr,s));
    }
    public static boolean BinarySearch(String arr[], String s)
    {
        int mid = 0, hi = arr.length-1, lo = 0;
        boolean flag = false;
        while(hi>=lo)
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