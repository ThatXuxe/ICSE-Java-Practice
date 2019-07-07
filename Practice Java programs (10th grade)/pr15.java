/*1+2+3...n
 * find sum
 */
import java.util.*;
public class pr15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        System.out.print("1");
        for(int i = 2;i<=n;i++)
        {
            System.out.print(" + "+i);
            sum = sum+i;
        }
        System.out.print(" = ");
        System.out.println(sum+1);
    }
}
    