import java.util.*;
public class pr12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = sc.nextInt();
        
        for(int i=0;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}    