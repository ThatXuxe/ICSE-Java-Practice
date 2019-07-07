import java.util.*;
/*
 * india
 * aidni
 * idni
 * dni
 * ni
 * i
 */
public class pr154
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = sc.nextLine();
      System.out.println("______________________________________");
      for(int i = s.length()-1; i>=0; i--)
      {
          for(int j = i; j>=0; j--)
          {
              System.out.print(s.charAt(j));
          }
          System.out.println();
      }
    }
}