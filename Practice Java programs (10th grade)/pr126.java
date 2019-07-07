import java.util.*;
public class pr126
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: (no special characters)");
      String s = sc.nextLine();
      int v = 0, c = 0;
      for(int i = 0; i<s.length(); i++)
      {
          if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')
              v++;
      }
      System.out.println("\nconsonants: "+(v)+"\nspecial characters: "+c);
    }
}