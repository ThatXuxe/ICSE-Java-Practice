import java.util.*;
public class pr109Binary
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 elements: ");
      char[] arr = new char[5];
      for(int i = 0; i<5; i++)
      {
          System.out.println("enter element: "+(i+1));
          arr[i] = sc.next().charAt(0);
      }
      System.out.println("__________________________");
      int first = 0, last = arr.length-1, mid = (first+last)/2, flag = 0;
      System.out.println("Enter search element: ");
      char s = sc.next().charAt(0);
      while(first<=last)
      {
          mid = (first+last)/2;
          if(arr[mid]==s)
          {
              flag = 1;
              break;
          }
          else if(arr[mid]>s)
          {
              last = mid-1;
          }
          else
          {
              first = mid+1;
          }
      }
      System.out.println((flag == 1)?"Element found at: "+(mid+1):"Element not found.");
    }
}