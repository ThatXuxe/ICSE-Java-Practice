import java.util.*;
/*
 * india
 * i
 * ni
 * dni
 * idni
 * aidni
 */
public class pr137

{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine();
      int x = 0;
      System.out.println("______________________");
      for(int i = 0; i<s.length(); i++)
      {
          for(int j = x; j>=0; j--)
          {
              System.out.print(s.charAt(j));
          }    
          x++;
          System.out.println();    
      }
    }
}