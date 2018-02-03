/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 10.5
*****************************************************************************/
package tenth.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ModifiedInvalidDocCodeDriver {
	public static void main(String[] args) throws InvalidDocumentCodeException, IOException {
		int doc, valid = 0, banned = 0;
		String code;
		char ch;

		InvalidDocumentCodeException problem = new
		 InvalidDocumentCodeException("Document code is not valid.");
		Scanner scan = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter document code:(STOP to quit) ");
		code = br.readLine();

		while (!code.equals("STOP")) {
			try {
				code = br.readLine();
				for (int i = 0; i < code.length(); i++) {
					ch = code.charAt(i);

					if (ch == 'U' || ch == 'C' || ch == 'P')
						valid++;
					else
						throw problem;
				}
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Enter document code:(STOP to quit) ");
			code = scan.nextLine();
		}
	}
}
