import java.util.*;
/*
 * my name is nitin arora
 * nitin arora
 */
public class pr152
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String s = sc.nextLine();
      s = s.trim();
      s = s + ' ';
      System.out.println("______________________________________");
      for(int i = 0; i<s.length(); i++)
      {
          char x = s.charAt(i);
          String w = "";
          while(x!=' ')
          {
              w += x;
              i++;
              x = s.charAt(i);
          }
          String r = ""; 
          for(int j = w.length()-1; j>=0; j--)
          {
              r+= w.charAt(j);
          }
          if(w.equals(r)==true)
              System.out.println(w);
      }
    }
}