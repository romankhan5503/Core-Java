package atmproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
		Scanner menuInput = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

		public void getLogin() throws IOException{
			int x = 1;
			do {
				try {
					data.put(952141, 191904);
					data.put(989947, 71976);
					
					System.out.println("Welcome to the ATM Project!");
					System.out.println("Enter your customer Number");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.println("Enter your PIN Number: ");
					setPinNumber(menuInput.nextInt());
				}
				catch(Exception e) {
					System.out.println("\n" + "Invald Character(s).Only Numbers." + "\n");
					x = 2;
				}	
				
				int cn = getCustomerNumber();
				int pn = getPinNumber();
				
				if (data.containsKey(cn) && data.get(cn) == pn) {
					getAccountType();
				} else
					System.out.println("\n" + "Wrong Customer or Pin Number" + "\n");
				} while (x == 1);
			}
			
			public void getAccountType() {
				System.out.println("Select the Account you want to Access: ");
				System.out.println("Type 1 - Current Account");
				System.out.println("Type 2 - Saving Account");
				System.out.println("Type 3 - Exit");
				
				int selection = menuInput.nextInt();
				
				switch (selection){
				case 1:
					getCurrent();
					break;
					
				case 2:
					getSaving();
					break;
					
				case 3:
					System.out.println("Thank You for Using this ATM, bye.  \n");
					break;
					
				default:
					System.out.println("\n" + "Invalid choice" + "\n");
				}
			}
			
			public void getCurrent() {
				System.out.println("Current Acccount: ");
				System.out.println("type 1 - View Balance");
				System.out.println("type 2 - Withdraw Amount");
				System.out.println("type 3 - Deposit Ammount");
				System.out.println("type 4 - Exit");
				System.out.println("Choice: ");
				
				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("Current Account Balance: " + moneyFormat.format(getCurrentBalance()));
					getAccountType();
					break;
					
				case 2:
					getCurrentWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getCurrentDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank You for using this ATM, bye.");
					break;
					
				default:
					System.out.println("\n" + "Inavlid Choice." + "\n");
					getCurrent();
				 }
			}
			
			public void getSaving() {
				System.out.println("Current Acccount: ");
				System.out.println("type 1 - View Balance");
				System.out.println("type 2 - Withdraw Amount");
				System.out.println("type 3 - Deposit Ammount");
				System.out.println("type 4 - Exit");
				System.out.println("Choice: ");
				
				int selection = menuInput.nextInt();
				
				switch (selection) {
				case 1:
					System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
					getAccountType();
					break;
					
				case 2:
					getSavingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getSavingDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thanl You for using this ATM, bye.");
					break;
					
				default:
					System.out.println("\n" + "Inavlid Choice." + "\n");
					getSaving();
				 }
			}
		}
	


