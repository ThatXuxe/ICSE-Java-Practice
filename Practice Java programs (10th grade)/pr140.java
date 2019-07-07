import java.util.*;
/*
 * 12345678910
 * 13579
 * 14710
 * 1510
 * 16
 * 17
 * 18
 * 19
 * 1
 */
public class pr140
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("______________________________________");
      for(int i = 1; i<=10; i++)
      {
          for(int j = 1; j<=10; )
          {
              if(i!=9)
              System.out.print(j);
              j = j + i;
          }
          if(i!=9)
          System.out.println();
      }
    }
}