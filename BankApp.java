import java.util.*;

class BankAccount {
	static Scanner input = new Scanner(System.in);
	String name, actype;
	int accNo, bal, amt;
	double saved, rate1, rate2, rate3;

	//Account details
	BankAccount(String name, int accNo, String actype, int bal) {
		this.name = name;
		this.accNo = accNo;
		this.actype = actype;
		this.bal = bal;
		
	}

	//Method to deposit money into account
	int deposit() {
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal + amt;
		return 0;
	}

	//Method to withdraw from account
	int withdraw() {
		System.out.println("Your Balance= R" + bal);
		System.out.print("Enter amount to withdraw:");
		amt = input.nextInt();
		if (bal < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal - amt;
		return 0;
	}

	 //Method to display account details   
	void display() {
		System.out.println("Name:" + name);
		System.out.println("Account No:" + accNo);
		System.out.println("Balance: R" + bal);

	}

	//This method displays remaining balance after transactions
	void dbal() {
		System.out.println("Balance: R" + bal);
	}

	//Method to show amount saved
	double saved() {
		// different interest rates depending the amount user has saved in their account. Derived from the table in FA1.
		rate1 = bal*0.005;
		rate2 = bal*0.02;
		rate3 = bal*0.05;
		if (bal >= 500){
			System.out.println("You saved: R"+ rate1);
		}
		if (bal >= 1000) {
			System.out.println("you saved: R"+ rate2);
		}
		if (bal <= 1000) {
			System.out.println("You saved: R"+ rate3);
		}
	return 0;
	}

	void exit() {
		//Exit message
		System.out.println("Thank you! Goodbye :)");
	}

	
	public static void main(String args[]) {
		//Account details to be entered by the user
		System.out.println("Enter your Name: ");
		String nn = input.nextLine();
		System.out.println("Enter Account Number: ");
		int num = input.nextInt();
		System.out.println("Enter Account Type: ");
		String type = input.next();
		System.out.println("Enter Initial Balance: ");
		int bal = input.nextInt();
		BankAccount b1 = new BankAccount(nn, num, type, bal);
		int menu;

		//Menu options
		System.out.println("Menu");
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Save Amount");
		System.out.println("5. Exit");
		boolean quit = false;

		//Do...while loop to run through menu options
		do {
			System.out.print("Please enter your choice: ");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				b1.deposit();
				break;

			case 2:
				b1.withdraw();
				break;

			case 3:
				b1.display();
				break;

			case 4:
				b1.saved();
				break;
			case 5:
				b1.exit();
				quit = true;
				break;
			}
		} while (!quit);
	}
}