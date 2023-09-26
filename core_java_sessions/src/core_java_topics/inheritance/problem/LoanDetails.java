package core_java_topics.inheritance.problem;

public class LoanDetails {
	
	public static void main(String[] args) {
		AutomobileLoan autoLoan = new AutomobileLoan();
		ConsumerLoan consumerLoan = new ConsumerLoan();
		GoldLoan goldLoan = new GoldLoan();
		
		autoLoan.setLoan_number(123456789l);
		autoLoan.setLoan_applicant_name("Roshini");
		autoLoan.setLoan_disbursed_date("29-04-2023");
		autoLoan.setMailing_address("Pune Address");
		autoLoan.setLoan_amount(300000.0d);
		autoLoan.setRoi_interest(7.5d);
		
		consumerLoan.setLoan_number(5678904l);
		consumerLoan.setLoan_applicant_name("Shubrat");
		consumerLoan.setMailing_address("Odhisha");
		consumerLoan.setLoan_disbursed_date("02-05-2023");
		consumerLoan.setLoan_amount(60000.0d);
		consumerLoan.setRoi_interest(11.5d);
		consumerLoan.setProcessing_fees(3000.0d);
		
		goldLoan.setLoan_number(564563353l);
		goldLoan.setLoan_applicant_name("Mohammed Kamran");
		goldLoan.setLoan_disbursed_date("29-04-2022");
		goldLoan.setMailing_address("Raichur Address");
		goldLoan.setLoan_amount(400000.0d);
		goldLoan.setRoi_interest(2.0d);
		goldLoan.setGold_loan_feature("Minimum Rate of Interest on glod loan");
		
		System.out.println("======= Automobile Loan ===============");
		System.out.println(autoLoan);
		System.out.println("======= Consumer Loan =================");
		System.out.println(consumerLoan);
		System.out.println("======= Gold Loan =====================");
		System.out.println(goldLoan);
	}
}