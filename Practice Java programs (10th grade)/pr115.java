import java.util.*;
/*
 * 1
 * 12
 * 123
 * 1235
 * 12357
 * 1235711...n
 */
public class pr115
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n");
      int n = sc.nextInt();
      System.out.println("__________________________");
      int flag = 1, k = 1, temp = 1;
      
      for(int i = 1; i<=n; i++)
      {
          System.out.print("1");
          temp = 1;
          for(int j = 2; j<=i;)
          {
              flag = 0;
              for(k = 1; k<=temp; k++)
              {
                  if(temp%k==0)
                  {
                      flag++;
                  }
              }
              if(flag == 2)
              {
                  System.out.print(temp);
                  j++;
              }    
              temp++;
          }
          System.out.println();
      }
          
      }
    }
//     public static int nextPrime(int x)
//     {
//         int flag = 0;
//         int i = 2;
//         while(flag == 0)
//         {
//             x++;
//             int n = x;
//             i = 2;
//             while(i<n)
//             {
//                 if(x%i==0)
//                 {
//                     flag = 1; break;
//                 }
//             }
//             if(flag == 0)
//             {
//                 break;
//             }    
//         }
//         return x;
//     }
