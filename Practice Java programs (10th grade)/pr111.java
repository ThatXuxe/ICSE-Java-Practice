import java.util.*;
public class pr111
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 numbers: ");
      int arr[] = new int[5];
      for(int i = 0; i<5; i++)
      {
          arr[i] = sc.nextInt();
      }
      System.out.println("__________________________");
      int sum = 0, dig; 
      for(int i = 0; i<5; i++)
      {
          int num = arr[i];
          while(num!=0)
          {
              dig = num%10;
              sum = sum + dig;
              num = num/10;
          }
          arr[i] = sum;
          sum = 0;
      }
      System.out.println("sorted array");
      for(int i = 0; i<5; i++)
      {
          System.out.println(arr[i]);
      }
    }
}