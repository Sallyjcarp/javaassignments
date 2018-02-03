/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 4.12
 *****************************************************************************/
package fourth.Assignment;
import java.io.*;
public class VowelCounter{
    public static void main(String args[]) throws IOException
    {
    	// main function reads a string from the user and determines how many vowels and non=vowel characters.
        String str;
        int vowels = 0, consonants = 0, digits = 0, blanks = 0;
        char ch;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a String : ");
        str = br.readLine();

        for(int i = 0; i < str.length(); i ++)
        {
            ch = str.charAt(i);

            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
                    ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                vowels ++;
            else if((ch >= 'a'&& ch <= 'z'))
                ++consonants;
            else if(Character.isDigit(ch))
                digits ++;
            else if(Character.isWhitespace(ch))
                blanks ++;
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Digits : " + digits);
        System.out.println("Blanks : " + blanks);
    }
}

