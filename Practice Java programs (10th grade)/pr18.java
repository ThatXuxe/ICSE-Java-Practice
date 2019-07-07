import java.util.*;
/*
 * 1-3+5-7..n
 */
public class pr18
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int res = 1;
      int j = 3;
      System.out.print("1");
      for(int i = 1; i<=n; i++)
      {
          if(i%2!=0)
          {
              System.out.print(" - "+j);
              res = res-j;
          }
          else
          {
              System.out.print(" + "+j);
              res = res+j;
          }
          j = j+2;
      }
      System.out.print("= "+res);
    }
}    