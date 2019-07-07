import java.util.*;
/*
 * 1,11,111,1111 ...n
 */
public class pr142
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n: ");
      int n = sc.nextInt();
      System.out.println("thanks");
      System.out.println("______________________________________");
      for(int i = 1; i<=n; i++)
      {
          for(int j = 1; j<=i; j++)
          System.out.print("1");
          System.out.print(", ");
      }
    }
}