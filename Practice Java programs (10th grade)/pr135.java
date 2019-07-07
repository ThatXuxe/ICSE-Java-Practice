import java.util.*;
/*
 * i 
 * in
 * ind
 */
public class pr135
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String: ");
      String s = sc.nextLine();
      System.out.println("______________________");
      for(int i = 1; i<=s.length(); i++)
      {
          for(int j = 0; j<i; j++)
              System.out.print(s.charAt(j));
          System.out.println();
      }
    }
}