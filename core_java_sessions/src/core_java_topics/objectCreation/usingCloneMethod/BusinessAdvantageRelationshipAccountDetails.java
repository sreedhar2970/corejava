package core_java_topics.objectCreation.usingCloneMethod;

public class BusinessAdvantageRelationshipAccountDetails {

	public static void main(String[] args) {
		try {
			
			BusinessAdvantageRelationshipAccount account1 = new BusinessAdvantageRelationshipAccount();
			account1.setBaa_acc_num(1111111111l);
			account1.setBaa_customer_name("Ramesh");
			account1.setBranch("Hyderabad Branch");
			account1.setBusiness_loan_amount(100000.0d);
			account1.setRoi(7.9d);
			account1.setTenure(5);
			account1.setCity("Hyderabad City");
			account1.setState("Telengana");
			
			System.out.println("================ Before using clone() of Object Class ========================");
			System.out.println("Account Number : " + account1.getBaa_acc_num());
			System.out.println("Customer Name : " + account1.getBaa_customer_name());
			System.out.println("Branch Name: " + account1.getBranch());
			System.out.println("Business Loan Amount : " + account1.getBusiness_loan_amount());
			System.out.println("Rate Of Interest: " + account1.getRoi());
			System.out.println("Tenure : " + account1.getTenure());
			System.out.println("City : " + account1.getCity());
			System.out.println("State : " + account1.getState());
					
			System.out.println("================ After implementing clone() method ===========================");
			BusinessAdvantageRelationshipAccount account2 = (BusinessAdvantageRelationshipAccount) account1.clone();
			account2.setBaa_acc_num(33333333333l);
			account2.setBaa_customer_name("Mohan");
			account2.setBranch("Pune Branch");
			account2.setBusiness_loan_amount(700000.0d);
			account2.setRoi(9.9d);
			account2.setTenure(5);
			account2.setCity("Pune City");
			account2.setState("Maharashtra");
			
			System.out.println("Account Number : " + account2.getBaa_acc_num());
			System.out.println("Customer Name : " + account2.getBaa_customer_name());
			System.out.println("Branch Name: " + account2.getBranch());
			System.out.println("Business Loan Amount : " + account2.getBusiness_loan_amount());
			System.out.println("Rate Of Interest: " + account2.getRoi());
			System.out.println("Tenure : " + account2.getTenure());
			System.out.println("City : " + account2.getCity());
			System.out.println("State : " + account2.getState());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
