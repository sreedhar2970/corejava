package Inheritancepractice;

public class Loandetails {

	public static void main(String[] args) {
		
		Automobileloan autoloan = new Automobileloan();
		croploan cploan = new croploan();
		tractorloan tloan = new tractorloan();
		
		autoloan.setAccnum(12345678);
		autoloan.setAmount(34000.0d);
		autoloan.setTenure(3);

		cploan.setAccnum(908764);
		cploan.setAmount(35000.0d);
		cploan.setTenure(4);
		
		tloan.setAccnum(2379484);
		tloan.setAmount(4000.0d);
		tloan.setTenure(3);
		
		System.out.println(autoloan);
	}

}
