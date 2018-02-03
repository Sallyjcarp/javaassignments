/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 10.4
*****************************************************************************/
package tenth.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvalidCodeDocumentDriver {
	public static void main(String[] args) throws InvalidDocumentCodeException, IOException {
		int valid = 0, banned = 0;
		String str;
		char ch;

		InvalidDocumentCodeException problem = new InvalidDocumentCodeException("Document code is not valid.");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter document code: ");
		str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			if (ch == 'U' || ch == 'C' || ch == 'P')
				valid++;
			else
				throw problem;
		}
		System.out.print("Document: " + str);
	}

}
