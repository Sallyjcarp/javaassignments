package seventh.assignment;
/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 7.6
*****************************************************************************/
import fifth.assignment.Account;

public class AccountListMain {
	public static void main(String[]args) {
		Account[] savings = new Account[30];
		// Create array of objects for account credentials.
		savings[0] = new Account("Ted Murphy", 72354, 25.00);
		savings[1] = new Account("Angelica Adams", 69713, 500.00);
		savings[2] = new Account("Edward Demsey", 93757, 100.00);
		savings[3] = new Account("Sandra Dean", 55347);
		savings[4] = new Account("Mike Matheson", 55433, 200.00);
		savings[5] = new Account("Sally Murphy", 72354, 25.00);
		savings[6] = new Account("Beth Quincy", 69734, 500.00);
		savings[7] = new Account("Sara Clark", 93724, 100.00);
		savings[8] = new Account("Sam Olson", 55358);
		savings[9] = new Account("Mike Murk", 55459, 200.00);
		savings[10] = new Account("Josh Wheat", 72356, 25.00);
		savings[11] = new Account("Sarah Right", 69717, 500.00);
		savings[12] = new Account("Dan Durk", 93757, 100.00);
		savings[13] = new Account("Sandra Dean", 55347);
		savings[14] = new Account("Mike Matheson", 55433, 200.00);
		savings[15] = new Account("Sally Murphy", 72354, 25.00);
		savings[16] = new Account("Kyle Lavine", 69713, 500.00);
		savings[17] = new Account("Paul Von", 93757, 100.00);
		savings[18] = new Account("Aaron Olson", 55347);
		savings[19] = new Account("Laura Mead", 55433, 200.00);
		savings[20] = new Account("Wayne Prawn", 72354, 25.00);
		savings[21] = new Account("Angelica Adams", 69713, 500.00);
		savings[22] = new Account("Katy Kline", 93757, 100.00);
		savings[23] = new Account("Sandra Dean", 55347);
		savings[24] = new Account("Cassie Lane", 55433, 200.00);
		savings[25] = new Account("Perry White", 72354, 25.00);
		savings[26] = new Account("Mike Brown", 69713, 500.00);
		savings[27] = new Account("Mylie Jackson", 93757, 100.00);
		savings[28] = new Account("Halley Rogers", 55347);
		savings[29] = new Account("Henry Plummer", 55433, 200.00);
		
		//Prints customer account number, name and balance.
		System.out.println(savings[0]);
		System.out.println(savings[1]);
		System.out.println(savings[2]);
		System.out.println(savings[3]);
		System.out.println(savings[4]);
		System.out.println(savings[5]);
		System.out.println(savings[6]);
		System.out.println(savings[7]);
		System.out.println(savings[8]);
		System.out.println(savings[9]);
		System.out.println(savings[10]);
		System.out.println(savings[11]);
		System.out.println(savings[12]);
		System.out.println(savings[13]);
		System.out.println(savings[14]);
		System.out.println(savings[15]);
		System.out.println(savings[16]);
		System.out.println(savings[17]);
		System.out.println(savings[18]);
		System.out.println(savings[19]);
		System.out.println(savings[20]);
		System.out.println(savings[21]);
		System.out.println(savings[22]);
		System.out.println(savings[23]);
		System.out.println(savings[24]);
		System.out.println(savings[25]);
		System.out.println(savings[26]);
		System.out.println(savings[27]);
		System.out.println(savings[28]);
		System.out.println(savings[29]);
		System.out.println();
		
		//Customer transactions
		savings[0].deposit(50.00); // return value ignored
		System.out.println("Adams deposit: $75.00");
		double adamsBalance = savings[1].deposit(75.00);
		System.out.println("Adams balance after deposit: $" + adamsBalance);
		System.out.println("Adams withdraw: $480.00");
		System.out.println("Transaction charge: $5");
		System.out.println("Adams balance after withdrawal: $" + savings[1].withdraw(480, 5.00));
		System.out.println();
		savings[2].withdraw(-100.00, 1.50); // invalid transaction
		savings[0].addInterest();
		savings[1].addInterest();
		savings[2].addInterest();
		savings[3].deposit(44.10); // return value ignored
		
		//Print customer balance after transactions are processed.
		System.out.println(savings[0]);
		System.out.println(savings[1]);
		System.out.println(savings[2]);
		System.out.println(savings[3]);
		System.out.println();

		
	}

}
