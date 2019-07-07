import java.util.*;
/*
 */
public class pr161
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word");
      String s = sc.nextLine().trim();
      s = s.toLowerCase();
      int x = s.charAt(s.length()-1);
      System.out.println("______________________________________");
      for(int i = s.length()-2; i>=0; i--)
      {
          int y = s.charAt(i);
          if(y<x)
          {
              y = y + x ;
              x = y - x ;
              y = y - x ;
          }
      }
      System.out.println("Smallest Letter: "+(char)x);
    }
}