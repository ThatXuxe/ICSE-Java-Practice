import java.util.*;
class NumCheck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int flag = 0;
    
        for(int i=0; i<n; i++)
        {
            if(i*(i+1) == n)
            {
                flag = 1;
                break;
            }
        }
         
        if(flag == 1)
            System.out.println(n+" is a Pronic Number.");
        else
            System.out.println(n+" is not a Pronic Number.");    
            
        int c = n, d, sum = 0;
         
        //finding sum of digits
        while(c>0)
        {
            d = c%10;
            sum = sum + d;
            c = c/10;
        }
         
        if(n%sum == 0)
            System.out.println(n+" is a Harshad Number.");
        else
            System.out.println(n+" is not a Harshad Number.");   
            
        int sq = n*n; // Finding the square
        c = 0;
        int copy = n;
         
        // While loop for counting the number of digits in the number
        while(copy > 0)
        {
            c++;
            copy = copy/10;
        }
         
        /* Finding the end digits of the square. 
         * If the number has 2 digits, then we need to find last 2 digits of square 
         * i.e. do a 'sq % 100' operation
         */
        int end = sq % (int)Math.pow(10,c);
         
        if(n == end) // If the square ends with the number then it is Automorphic
            System.out.print(n+" is an Automorphic Number.");
        else
            System.out.print(n+" is not an Automorphic Number.");    
    }
}