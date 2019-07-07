import java.util.*;
public class pr102
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 numbers: ");
      int[] arr = new int[5];
      for(int i = 0; i<5;i++)
          arr[i] = sc.nextInt();
      System.out.println("__________________________");
      System.out.println("Enter search Item");
      int s = sc.nextInt(), flag = 0, i;
      for(i = 0; i<5; i++)
      {
          if(s==arr[i])
          {
              flag = 1;
              break;
          }    
      }
      System.out.println((flag == 1)?"item found at "+(i+1):"not found");
    }
}