import java.util.*;
public class pr113
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter 5 numbers: ");
      int[] arr = new int[5];
      for(int i = 0; i<5; i++)
      {
         arr[i] = sc.nextInt();
      }
      System.out.println("__________________________");
      for(int i = 0; i<5; i++)
      {
          if(arr[i]%2==0)
          {
              System.out.println(arr[i]%10);
          }
          else
          {
              System.out.println((arr[i]%100)/10);
          }
      }
    }
}