import java.util.*;
class Initials
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char x;
        int l;
        System.out.print("Enter any sentence: ");
        s=sc.nextLine();
        s=" "+s; 
        //adding a space infront of the name
        s=s.toUpperCase(); 
        //converting the sentence into 
        //Upper Case (Capital Letters)
        l=s.length(); 
        //finding the length 
        //of the sentence
        System.out.print("Output = ");
         
        for(int i=0;i<l;i++)
        {
            x=s.charAt(i);
            //taking each character at a time 
            if(x==' ') 
            //if it is a space, printing the next Character 
                System.out.print(s.charAt(i+1)+".");
        }
    }
}