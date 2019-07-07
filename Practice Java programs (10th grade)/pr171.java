import java.util.*;
/*
 */
public class pr171
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String s = sc.nextLine().trim();
      System.out.println("______________________________________");
      char flag = '0';
      while(flag == '0')
      {
          System.out.println("Enter:\n 'a' for shortest word\n 'b' for longest word\n 'e' for exit");
          switch(sc.next().charAt(0))
          {
              case 'a': System.out.println(shortestFind(s));
                        break;
              case 'b': System.out.println(longestFind(s));
                        break;
              case 'e': flag = '1';
                        break;
              default: System.out.println("Wrong choice, enter again.");          
          }
      }
    }
    public static String shortestFind(String s)
    {
        int x = s.indexOf(' ');
        String t = s.substring(0, s.indexOf(' '));
        for(int i = x+1; i<s.length(); i++)
        {
            if(s.charAt(i)==' ' || i == s.length()-1)
            {
                if(i-x<t.length())
                {
                    t = s.substring(x,i);
                }
                x = i+1;
            }
        }
        return t;
    }
    public static String longestFind(String s)
    {
        int x = s.indexOf(' ');
        String t = s.substring(0, s.indexOf(' '));
        for(int i = x+1; i<s.length(); i++)
        {
            if(s.charAt(i)==' ' || i == s.length()-1)
            {
                if(i-x>t.length())
                {
                    t = s.substring(x,i+1);
                }
                x = i + 1;
            }
        }
        return t;
    }
}