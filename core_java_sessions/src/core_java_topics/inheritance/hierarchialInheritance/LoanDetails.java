package core_java_topics.inheritance.hierarchialInheritance;

public class LoanDetails {

	public static void main(String[] args) {

		MicroFinanceLoan microLoan = new MicroFinanceLoan();
		TractorLoan tLoan = new TractorLoan();
		
		microLoan.setLoan_num(123456l);
		microLoan.setLoan_applicant("Mohammed Kamran");
		microLoan.setDisbusred_date("24-06-2023");
		microLoan.setLoan_amount(40000.0d);
		microLoan.setFeature("This is MIcro Finance loan");
		microLoan.setLoan_emi(4000.0d);
		
		tLoan.setLoan_num(5646578l);
		tLoan.setLoan_applicant("Mohammed Farhan");
		tLoan.setDisbusred_date("14-09-2024");
		tLoan.setLoan_amount(50000.0d);
		tLoan.setLoan_emi(5000.0d);
		tLoan.setProcessing_fee(8000.0d);
		tLoan.setMinimum_tenure(7);
		
		System.out.println("=============== Micro Finanace Loan ================");
		System.out.println("Loan Number : " + microLoan.getLoan_num());
		System.out.println("Customer Name : " + microLoan.getLoan_applicant());
		System.out.println("Disbursed Date : " + microLoan.getDisbusred_date());
		System.out.println("Loan Amount : " + microLoan.getLoan_amount());
		System.out.println("Emi : " + microLoan.getLoan_emi());
		System.out.println("Features  : " + microLoan.getFeature());
		System.out.println("=============== Tractor Loan =======================");
		System.out.println("Loan Number : " + tLoan.getLoan_num());
		System.out.println("Customer Name : " + tLoan.getLoan_applicant());
		System.out.println("Disbursed Date : " + tLoan.getDisbusred_date());
		System.out.println("Loan Amount : " + tLoan.getLoan_amount());
		System.out.println("Emi : " + tLoan.getLoan_emi());
		System.out.println("Processing fee : " + tLoan.getProcessing_fee());
		System.out.println("Minimum Tenure : " + tLoan.getMinimum_tenure());
	}
}