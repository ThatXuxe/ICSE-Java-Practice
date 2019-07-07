import java.util.*;
/*
 */
public class pr172
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two strings:");
      String s1 = sc.nextLine().trim();
      String s2 = sc.nextLine().trim();
      if(s1.length()>s2.length())
      {
          String temp = s1;
          s1 = s2;
          s2 = temp;
      }
      else if(s1.length()==s2.length())
      {
          System.out.println("try again");
          System.exit(0);
      }
      System.out.println("______________________________________");
      System.out.println(checkString(s1,s2));
    }
    public static boolean checkString(String s,String t)
    {
        boolean flag = false;
        for(int i = 0; i<=t.length()-s.length(); i++)
        {
            if(t.substring(i, i+s.length()).equals(s)==true)
            {
                flag = true;
            }
        }
        return flag;
    }
}