import java.util.*;
/*
 * india is my country
 * iaismycy
 */
public class pr149
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String s = sc.nextLine();
      s = s.trim();
      System.out.println("______________________________________");
      String r = "";
      r += s.charAt(0);
      for(int i = 2; i<s.length(); i++)
      {
          if(s.charAt(i)==' ')
          {
              r += s.charAt(i-1);
              r += s.charAt(i+1);
          }    
      }
      r+= s.charAt(s.length()-1);
      System.out.println("result = "+r);
    }
}