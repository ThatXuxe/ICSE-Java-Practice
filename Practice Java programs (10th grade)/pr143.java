import java.util.*;
/*
 * india
 * ndi
 * d
 */
public class pr143
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String s = sc.nextLine();
      s = s.trim();
      System.out.println("______________________________________");
      while(s.equals("")==false)
      {
          System.out.println(s);
          if(s.length()>1)
              s = s.substring(1, s.length()-1);
          else
              break;
      }
    }
}