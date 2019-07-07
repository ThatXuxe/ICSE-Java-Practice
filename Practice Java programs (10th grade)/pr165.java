import java.util.*;
/*
 * 
 */
public class pr165
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two strings");
      String s = sc.nextLine().trim();
      String t = sc.nextLine().trim();
      System.out.println("______________________________________");
      int flag = 0;
      for(int i = 0; i<3; i++)
      {
          //abcdef
          //xyzabc
          if(s.charAt(i)!=t.charAt(t.length()-3+i))
          {
              flag = 1;
              break;
          }    
      }
      System.out.println((flag == 0)?"equal":"not equal");
    }
}