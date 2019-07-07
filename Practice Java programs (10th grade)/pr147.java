import java.util.*;
/*
 * india
 * 
 * aidni
 * aidn
 * aid
 * ai
 * a
 */
public class pr147
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String s = sc.nextLine();
      s = s.trim();
      System.out.println("______________________________________");
      for(int i = s.length(); i>=0; i--)
      {
          for(int j = s.length()-1; j!=(s.length()-1-i); j--)
              System.out.print(s.charAt(j));
          System.out.println();    
      }
    }
}