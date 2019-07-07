import java.util.*;
/*
 * india
 *   __i
 *   _ind
 *   india 
 *    
 */
public class pr144
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String s = sc.nextLine();
      int x = (s.length()+1)/2;
      System.out.println("______________________________________");
      for(int i = 1; i<=s.length(); i+=2)
      {
          for(int j = 1; j<x; j++)
             System.out.print(" ");
          for(int j = 0; j<i; j++)
          {
              System.out.print(s.charAt(j));
          }
          x--;
          System.out.println();   
      }
    }
}