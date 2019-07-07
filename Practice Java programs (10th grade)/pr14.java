import java.util.*;
import java.lang.Math.*;
/*
 * 153
 * 1+125+27
 */
public class pr14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arm, dup;
        System.out.println("Enter the number");
        arm = sc.nextInt();
        dup = arm;
        double sum=0;
        while(arm!=0)
        {
            sum = sum+Math.pow(arm%10,3);
            
            arm = arm/10;
        }
        if(dup == sum)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number isnt armstrong.");
        }
    }
}