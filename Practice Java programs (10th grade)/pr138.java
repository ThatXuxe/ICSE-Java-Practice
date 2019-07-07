import java.util.*;
/*
 * india
 * i
 * nn
 * ddd
 * iiii
 * aaaaa
 */
public class pr138
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine();
      System.out.println("______________________");
      for(int i = 0; i<=s.length()-1; i++)
      {
          for(int j = 0; j<=i; j++)
          {
              System.out.print(s.charAt(i));
          }
          System.out.println();
      }
    }
}