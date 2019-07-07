import java.util.*;
/*
 * soham
 * st
 * stop
 * stophi
 * stophiab
 * ...
 */
public class pr164
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine().trim();
      System.out.println("______________________________________");
      for(int i = 0; i<s.length(); i++)
      {
          for(int j = 0; j<=i ; j++)
              System.out.print(s.charAt(j)+""+(char)(s.charAt(j)+1));
          System.out.println();
      }
    }
}