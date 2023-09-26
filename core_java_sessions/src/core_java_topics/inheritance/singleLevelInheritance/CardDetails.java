package core_java_topics.inheritance.singleLevelInheritance;

public class CardDetails {
	
	public static void main(String[] args) {

		AxisBankVistaraInfiniteCreditCard ccCard = new AxisBankVistaraInfiniteCreditCard();
		ccCard.setCc_num(123456789l);
		ccCard.setCc_holder_name("Mohammed Kamran");
		ccCard.setExpiry_date("20-09-2030");
		ccCard.setCc_limit(50000.0d);
		ccCard.setCvv_num(234);
		ccCard.setPin_num(4234);
		ccCard.setClub_Vistara_Points("6 CV points on every spend of Rs. 200");
		ccCard.setTop_Features("10000 CV points on spends on 1L in the first 90 days");
		ccCard.setSpecial_Service("1 complimentary Business class ticket on joining");
		
		System.out.println("============ Credit Card Details ====================");
		System.out.println("CC Number : " + ccCard.getCc_num());
		System.out.println("Holder Name : " + ccCard.getCc_holder_name());
		System.out.println("Expiry Date: " + ccCard.getExpiry_date());
		System.out.println("Cvv Number : " + ccCard.getCvv_num());
		System.out.println("Pin Number : " + ccCard.getPin_num());
		System.out.println("Credit Limit : " + ccCard.getCc_limit());
		System.out.println("Vistara Points : " + ccCard.getClub_Vistara_Points());
		System.out.println("Top Features : " + ccCard.getTop_Features());
		System.out.println("Special Service : " + ccCard.getSpecial_Service());
		
	}

}
