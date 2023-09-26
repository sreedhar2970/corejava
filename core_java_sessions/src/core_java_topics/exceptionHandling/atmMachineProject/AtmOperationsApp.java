package core_java_topics.exceptionHandling.atmMachineProject;

import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class AtmOperationsApp {

	public static void main(String[] args) throws InvalidAmountException,InsufficientResourcesException {

		int option = 0;
		String nextOption = null;
		double amount =0.0d;
		double withDrawAmount = 0.0d;
		String debitCard = null;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Please insert your debit card");
			debitCard = scanner.next();
			try {
				 IATMService dCard = new AxisDebitCard();
				 start :
					 	while(true) {
					 		System.out.println("===== Choose the operation you want to perform ============");
					 		System.out.println("1.Deposit");
					 		System.out.println("2.Withdraw");
					 		System.out.println("3.Check Balance");
					 		System.out.println("4.Exit");
					 		option = scanner.nextInt();
					 		try {
					 			switch(option) {
					 				case 1 :
					 					System.out.println("Please enter the amount you want to deposit");
					 					amount = scanner.nextDouble();
					 					dCard.depositAmount(amount);
					 					System.out.println("Amount :" + amount + " Credited into your Account");
					 					break;
					 				case 2 :
					 					System.out.println("Please enter the amount you want to withdraw");
					 					withDrawAmount = scanner.nextDouble();
					 					dCard.withdrawAmount(withDrawAmount);
					 					System.out.println("Amount : " + withDrawAmount + " Debited from your Account");
					 					break;
					 				case 3 :
					 					System.out.println("Your current balance is : " + dCard.checkBalance());
					 					break;
					 				case 4 :
					 					break start;
					 				default :
					 					System.out.println("Invalid Operation......");
					 			}
					 			System.out.println("Do you want to continue...");
					 			System.out.println("Press Y to Continue or Press N to Exit");
					 			nextOption = scanner.next();
					 			if("N".equalsIgnoreCase(nextOption)) {
					 				break start;
					 			}
					 		}catch(InvalidAmountException iae) {
					 			System.out.println(iae.getMessage());
					 		}catch (InSufficientAmountException ise) {
								System.out.println(ise.getMessage());
							}
					 	}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("=====================================================================");
			System.out.println("============= Thanks for visitng ATM ================================");
			System.out.println("=====================================================================");
		}
	}
}