// number which has zeroes present
// but there should be no zero
// present in the beginning of the number
import java.io.*;
class Duck_No
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        String n=br.readLine();
        //inputting the number 
 
        int l=n.length(); 
        //finding the length of the number
        int c=0; 
        //counting number of 0
        char ch;
 
        for(int i=1;i<l;i++)
        {
            ch=n.charAt(i);
            //taking digit and checking if it is '0'
            if(ch=='0')
                c++;
        }
 
        char f=n.charAt(0);
        //taking the first digit of the inputted number
 
        if(c>0 && f!='0')
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}