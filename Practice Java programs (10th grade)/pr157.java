import java.util.*;
/*
 * india is my country
 * is my
 */
public class pr157
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String s = sc.nextLine().trim();
      System.out.println("______________________________________");
      int i1 = 432, i2 = 3243;
      String t = "";
      for(i1 = 0; s.charAt(i1)!=' '; i1++);
      for(i2 = s.length()-1; s.charAt(i2)!=' '; i2--);    
      for(int i = i1+1; i<=i2; i++)
          t += s.charAt(i);
      System.out.println(t);
    }
}
// while(flag==0)
//       {
//           if(s.charAt(0)==' ')
//           {
//               s = s.substring(1, s.length());
//               t1 = true;
//           }
//           else if(t1 == false)
//               s = s.substring(1, s.length());
//               
//           if(s.charAt(s.length()-1)==' ')
//           {
//               s = s.substring(0, s.length()-1);
//               t2 = true;
//           }
//           else if(t2 == false)
//           {
//               s = s.substring(0, s.length()-1);
//           }
//           
//           if(t1 == true && t2 == true)
//               flag = 1;
//       }