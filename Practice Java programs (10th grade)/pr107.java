import java.util.*;
public class pr107
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length: ");
      char[] arr = new char[sc.nextInt()];
      System.out.println("Enter the values: ");
      for(int i = 0; i < arr.length; i++)
      {
          arr[i] = sc.next().charAt(0);
      }
      System.out.println("__________________________");
      for(int i = 0; i<arr.length; i++)
      {
          for(int j = 0; j<arr.length-i-1; j++)
          {
              if(arr[j]<arr[j+1])
              {
                  char p = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = p;
              }
          }
      }
      for(int i = 0; i<arr.length; i++)
          System.out.println(arr[i]);
    }
}