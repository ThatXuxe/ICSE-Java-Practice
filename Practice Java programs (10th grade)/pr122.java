import java.util.*;
public class pr122
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String s = sc.nextLine();
      System.out.println("First letter: "+s.charAt(0));
      System.out.println("Last letter:"+s.charAt(s.length()-1));
    }
}