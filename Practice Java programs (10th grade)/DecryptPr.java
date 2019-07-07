import java.util.*;
class DecryptPr
{
    public static void main(String args[])
    {
        EncryptPr ob = new EncryptPr();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        int L = s.length();
        if(L<4 || L>99)
        {
            System.out.println("INVALID LENGTH");
        }
        else
        {
            ob.rotate(s);
        }
        //checks for right length 
    }
    void rotate(String w)
    {
        char ch;
        int a = 0;
        String ans = "";
        for(int i = 0; i<w.length(); i++)
        {
            ch = w.charAt(i);
            //reinitialized ch to next letter
            if(Character.isLetter(ch))
            {
                a = ch - 13;
                // increases value by 13 
                if((Character.isUpperCase(ch) && a>90) || (Character.isLowerCase(ch) && a>122))
                {
                    a = a - 26;
                }//subtracts 26 if ascii value is exceeded from what is required 
                 //
                ch = (char)a;
                //explicit conversion from ascii to character
            }
            ans = ans + ch;
            //added character to answer string
        }
        System.out.println("OUTPUT : The cipher text is :\n"+ans);
    }
     
}