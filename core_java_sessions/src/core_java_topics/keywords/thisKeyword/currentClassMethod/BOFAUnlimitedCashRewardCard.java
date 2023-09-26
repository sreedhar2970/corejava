package core_java_topics.keywords.thisKeyword.currentClassMethod;

public class BOFAUnlimitedCashRewardCard {

	long crc_card_number;
	String crc_holder_name;
	String expiry_date;
	double limit;
	int pinNum;
	
	public BOFAUnlimitedCashRewardCard(long crc_card_number, String crc_holder_name, String expiry_date, double limit,
			int pinNum) {
		super();
		this.crc_card_number = crc_card_number;
		this.crc_holder_name = crc_holder_name;
		this.expiry_date = expiry_date;
		this.limit = limit;
		this.pinNum = pinNum;
	}
	public void method1() {
		this.displayCardInfo();
		System.out.println("====== This is method1 =============");
	}
	public void displayCardInfo() {
		System.out.println("============ Credit card details ====================");
		System.out.println("crc_card_number : " + crc_card_number);
		System.out.println("crc_holder_name : " + crc_holder_name);
		System.out.println("expiry_date : " + expiry_date);
		System.out.println("limit : " + limit);
		System.out.println("pinNum : " + pinNum);
	}
	public static void main(String[] args) {
		BOFAUnlimitedCashRewardCard card = new BOFAUnlimitedCashRewardCard(12345l,"Mohammed Kamran", "23-09-2030",50000.0d, 8456);
		card.method1();
	}
}
