import java.util.*;
public class pr133
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String w = sc.nextLine(), s = "";
      int j = 3;
      System.out.println("__________________________");
      if(w.length()<6)
          System.out.println("Too short.");
      else
          for(int i = 0; i<6; i++)
          {
              if(i<3)
                  s = s + w.charAt(i);
              else
              {
                  s = s + w.charAt(w.length()-j);
                  j--;
              }    
          }
      System.out.println("new word: "+s);    
    }
}