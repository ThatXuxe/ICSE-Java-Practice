import java.util.*;
/*
 * Piglatin: 
 * soham
 * ohamsay
 */
public class pr134
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String s = sc.nextLine();
      String res = s.substring(1,s.length());
      res = res + s.charAt(0) + "ay";
      System.out.println(res);
    }
}