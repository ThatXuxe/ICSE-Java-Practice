import java.util.*;
/*
 * 1
 * 121
 * 12321
 * 1234321...n
 */
public class pr114
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows: ");
      int n = sc.nextInt();
      System.out.println("__________________________");
      int x = 1; int k =1;
      for(int i = 1; i<=n; i++)
      {
          x=1;
          k = 1;
          for(int j = (i*2)-1; j>0; j--)
          {
              System.out.print(x);
              x = x+k;
              if(x==i)
                  k = -1;
          }
          System.out.println();
      }
    }
}