import java.util.*;
/*
 * 101010
 * 01010
 * 1010
 * 010
 * 1
 */
public class pr141
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no. rows: ");
      int n = sc.nextInt(), x = n;
      System.out.println("______________________________________");
      for(int i = 1; i<=n; i++)
      {
          for(int j=x; j>0; j--)
               System.out.print((j%2==0)?"0":"1");
          System.out.println();
          x--;
      }
    }
}