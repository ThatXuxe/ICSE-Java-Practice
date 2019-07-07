import java.util.*;
/*
 * 1+2-3+4-...n
 * 
 */
public class pr16
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n =sc.nextInt();
      int res=0;
      System.out.print("1");
      for(int i=2;i<=n;i++)
      {
          if(i%2==0)
          {
              System.out.print(" + "+i);
              res = res+i;
          }
          else
          {
              System.out.print(" - "+i);
              res = res-i;
          }
      }
      //add 1
      res = res+1;
      System.out.print(" = "+res);
    }
}