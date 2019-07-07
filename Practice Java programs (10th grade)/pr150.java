import java.util.*;
/*
 * a
 * bc
 * def
 * ghij
 * klmno
 * pqrstu
 */
public class pr150
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      System.out.println("______________________________________");
      char x = 'a';
      for(int i = 1; i<=n; i++)
      {
          for(int j = 1; j<=i; j++)
          {
              System.out.print(x);
              x++;
          }
          System.out.println();
      }
    }
}