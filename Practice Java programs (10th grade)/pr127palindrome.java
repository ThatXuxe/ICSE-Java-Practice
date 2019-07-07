import java.util.*;
public class pr127palindrome
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String s = sc.nextLine();
      String rev = "";
      System.out.println("__________________________");
      for(int i = s.length()-1; i>=0; i--)
          rev = rev + s.charAt(i);
      System.out.println((rev.equals(s)==true)?"It is a Palindrome":"Not a palindrome");    
    }
}