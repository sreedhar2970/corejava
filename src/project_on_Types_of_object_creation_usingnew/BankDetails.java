package project_on_Types_of_object_creation_usingnew;

public class BankDetails {

	public static void main(String[] args) {
		
		Bank details = new Bank();
		details.setBankname("hdfc");
		details.setAddress("hyderabad");
		details.setIfsccode("HDFC005407");
        details.setPincode(234567);
        
       System.out.println("===================================");
       System.out.println("bankname:"+details.getBankname());
       System.out.println("bankaddress:"+details.getAddress());
       System.out.println("bankifsccode:"+details.getIfsccode());
       System.out.println("bankpincode:"+details.getPincode());
	}

}
