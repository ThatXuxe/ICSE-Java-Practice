import java.util.*;
/*
 * aa
 * aba
 * abca
 * abcda
 * abcdea
 */
public class pr151
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
          x = 'a';
          for(int j = 1; j<=i; j++)
          {
              System.out.print(x++);
          }
          System.out.println("a");
      }
    }
}