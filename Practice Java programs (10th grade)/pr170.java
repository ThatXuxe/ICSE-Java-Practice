import java.util.*;
/*
 */
public class pr170
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = sc.nextLine().trim();
      System.out.println("______________________________________");
      System.out.println(reverse(s));
    }
    public static String reverse(String s)
    {
        String rev = "";
        s = " " + s;
        int x = s.length();
        for(int i = s.length()-1; i>=0; i--)
        {
            if(s.charAt(i)==' ')
            {
                rev += s.substring(i+1, x) + " ";
                x= i;
            }
        }
        return rev;
    }
}