import java.util.*;
public class pr103
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 ascending no.s: ");
      int[] arr = new int[5];
      for(int i = 0; i<5; i++)
      {
          arr[i]= sc.nextInt();
      }
      System.out.println("__________________________");
      System.out.println("Enter search item: ");
      int s = sc.nextInt(), last=5-1, first = 0, mid = 0, flag = 0;
      while(first<=last)
      {
          mid = (first + last)/2;
          if(s == arr[mid])
          {
               flag = 1;
               break;
          }
          else if(s>arr[mid])
          {
              first = mid+1;
          }
          else
          {
              last = mid-1;
          }
      } 
      System.out.println((flag == 1)?"item found at "+(mid+1):"not found");
    }
}