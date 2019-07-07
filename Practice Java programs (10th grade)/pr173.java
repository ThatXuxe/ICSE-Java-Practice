import java.util.*;
/*
 */
public class pr173
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = sc.nextLine();
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      if(s.length()<n)
      {
          System.out.println("wrong input: ");
          System.exit(0);
      }
      System.out.println("______________________________________");
      boolean exit = false;
      System.out.println("Enter \na for first n\nb for last n \ne for exiting\nc for changing case on right\nd for changing case on left\nn for counting special characters");
      while(exit == false)
      { 
          switch(sc.next().charAt(0))
          {
              case 'a': System.out.println(firstN(s,n));
                      break;
                      
              case 'b': System.out.println(lastN(s,n));
                      break;
                      
              case 'c': System.out.println(changeCaseA(s,n));
                      break;
                      
              case 'd': System.out.println(changeCaseB(s,n));
                      break;
                      
              case 'n': System.out.println(countSymbols(s));        
                       break;
              case 'e': exit = true;
                      break;
                      
              default:System.out.println("wrong input, try again");
          }
      }
    }
    public static String firstN(String s, int n)
    {
        String t = "";
        for(int i = 0; i<n; i++)
        {
            t += s.charAt(i); 
        }
        return t;
    }
    public static String lastN(String s, int n)
    {
        String t = "";
        for(int i = s.length()-n; i<s.length(); i++)
            t+= s.charAt(i);
        return t;
    }
    public static String changeCaseA(String s, int n)
    {
        s = firstN(s,n);
        String t = "";
        char o = ' ';
        for(int i = 0; i<n; i++)
        {
            o = s.charAt(i);
            if(Character.isUpperCase(o)==true)
                t += Character.toLowerCase(o);
            else if(Character.isLowerCase(o)==true)
                t += Character.toUpperCase(o);    
        }
        return t; 
    }
    public static String changeCaseB(String s, int n)
    {
        s = lastN(s,n);
        String t = "";
        for(int i = 0; i<n; i++)
        {
            char o = s.charAt(i);
            if(Character.isUpperCase(o)==true)
                t += Character.toLowerCase(o);
            else if(Character.isLowerCase(o)==true)
                t += Character.toUpperCase(o);    
        }
        return t;
    }
    private static int countSymbols(String s)
    {
        int n = 0;
        for(int i = 0; i<s.length(); i++)
        {
            int x = (int)s.charAt(i);
            if((x>=97 && x<97+26 )||(x>=65 && x<65+26) && (x>=48 && x<= 58))
            {
                n++;
            }
        }
        return n;
    }
}