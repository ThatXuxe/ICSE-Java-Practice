import java.util.*;
/*
 * india
 * i
 * nn
 * ddd
 * iiii
 * aaaaa
 */
public class pr139
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a word: ");
      String s = sc.nextLine();
      System.out.println("______________________");
      for(int i = s.length()-1; i>=0; i--)
      {
          for(int j = i; j>=0; j--)
          {
              System.out.print(s.charAt(i));
          }
          System.out.println();
      }
    }
}