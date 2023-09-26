package core_java_topics.collectionFramework.mapInterface.hashMap.realtime;

public class CreditCard {

	long cc_number;
	String cc_holder_name;
	String bank_name;
	String expiry_date;
	int cvv_number;
	double credit_card_limit;
	
	public CreditCard(long cc_number, String cc_holder_name, String bank_name, String expiry_date, int cvv_number,
			double credit_card_limit) {
		super();
		this.cc_number = cc_number;
		this.cc_holder_name = cc_holder_name;
		this.bank_name = bank_name;
		this.expiry_date = expiry_date;
		this.cvv_number = cvv_number;
		this.credit_card_limit = credit_card_limit;
	}

	@Override
	public String toString() {
		return "CreditCard [cc_number=" + cc_number + ", cc_holder_name=" + cc_holder_name + ", bank_name=" + bank_name
				+ ", expiry_date=" + expiry_date + ", cvv_number=" + cvv_number + ", credit_card_limit="
				+ credit_card_limit + "]";
	}
}
