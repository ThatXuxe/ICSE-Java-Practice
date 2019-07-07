import java.util.*;
// 1+3+5+7...n
public class pr17
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      int j = 3;
      int res = 1;
      System.out.print("1");
      for(int i=1;i<=n-1;i++)
      {
         res = res+j;
         System.out.print(" + "+j);
         j = j+2;
      }
      System.out.print("= "+res);
    }
}