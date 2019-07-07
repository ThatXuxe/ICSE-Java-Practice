import java.util.*;
/*
 * importance
 * importance 
 * mportanc
 * portan
 * orta
 * rt
 * 
 */
public class pr156
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String s = sc.nextLine().trim();
      System.out.println("______________________________________");
      int i = 0;
      while(s.length()!=0)
      {
          System.out.println(s);
          s = s.substring(1,s.length()-1);
          i++;
      }
    }
}