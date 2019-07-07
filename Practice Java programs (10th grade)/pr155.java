import java.util.*;
/*
 * 11111
 *  1111
 *   111
 *    11
 *     1
 *    11
 *   111
 *  1111
 * 11111 
 */
public class pr155
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int x = 0;
      int n = sc.nextInt();
      for(int i = n; i>0; i--)
      {
          for(int j = 0; j<x; j++)
              System.out.print(" ");
          for(int k = i; k>0; k--)
              System.out.print("1");
          System.out.println(); 
          x++;
      }
      x = n-2;
      for(int i = 2; i<n+1; i++)
      {
          for(int j = 0; j<x; j++)
              System.out.print(" ");
          for(int k = 1; k<=i; k++)
              System.out.print("1");
          System.out.println(); 
          x--;
      }
    }
}