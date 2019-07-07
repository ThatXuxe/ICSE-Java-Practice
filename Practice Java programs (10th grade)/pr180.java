import java.util.*;
/*
 */
public class pr180
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String s = sc.nextLine();
      System.out.println("______________________________________");
      char x = ' ';
      while(x!='e')
      {
          System.out.println("Enter 1 for reversing end words\n Enter 2 for reversing middle words\nEnter e for exiting.");
          x = sc.next().charAt(0);
          switch(x)
          {
              case '1':System.out.println(f1(s));
                       break;
              case '2':System.out.println(f2(s));
                       break;
              case 'e':System.exit(0);
              
              default:System.out.println("Wrong input, try again");
          }
      }    
    }
    public static String f1(String s) 
    {
        String t = "";
        String res = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(i<=s.indexOf(' '))
            {
                t = s.charAt(i) + t;
            }
            else if(i==(s.indexOf(' ')+1))
            {
                res += t;
                t = "";
            }
            else if(i>=s.lastIndexOf(' '))
            {
                t = s.charAt(i) + t;
            }
        }  
        res = res + s.substring(s.indexOf(' '), s.lastIndexOf(' ')) + " " +t;
        return res;
    }
    public static String f2(String s)
    {
        String res = s.substring(0, s.indexOf(' '))+ " ";//first word
        s = s.substring(s.indexOf(' ')+1, s.length());//string - first word
        String dup = s;//duplicate
        String rev = "";
        for(int i = 0; i<s.lastIndexOf(' '); i++)
        {
            rev = "";
            String t = s.substring(0, s.indexOf(' '));
            for(int j = t.length()-1; j>=0; j--)
            {
                rev = rev + t.charAt(j);
            }
            res = res +" " + rev;
            s = s.substring(s.indexOf(' ')+1, s.length());
        }
        res = res + dup.substring(dup.lastIndexOf(' '), dup.length());
        return res;
    }
}
