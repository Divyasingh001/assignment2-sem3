import java.util.Scanner;
public class Character{
     static void check(char ch)
    {
     
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch +
                    " is an UpperCase character");
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch +
                    " is an LowerCase character" );
     
        else
            System.out.println("\n" + ch +
                    " is not an aplhabetic character" );
    }
public static void main(String []args)
    {
        char ch;
        ch = 'A';
        check(ch);
        ch = 'a';
        check(ch);
        ch = '0';
        check(ch);
 }
}