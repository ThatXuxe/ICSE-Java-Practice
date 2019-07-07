import java.util.*;
/*
 *    1
 *   2 3
 *  4   5 
 * 6     7  
 */
public class pr120
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no.of rows:");
      int n = sc.nextInt();
      int d = 1, x = n-1, y = -1;
      System.out.println("__________________________");
      for(int i = 1; i<=n; i++)
      {
          for(int j = 1; j<=x; j++)
          {
              System.out.print(" ");
          }
          x--;
          System.out.print(d);
          d++;
          for(int j = 1; j<=y; j++)
          {
              System.out.print(" ");
          }
          if(x!=n-2)
          {
              System.out.print(d);
              d++;
          }
          System.out.println();
          y = y+2;
      }
    }
}