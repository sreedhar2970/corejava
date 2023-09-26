package core_java_topics.objectInJava.usingMethod;

public class BusinessAdvantageplusAccountDetails {

	public static void main(String[] args) {

		BusinessAdvantageplusAccount account1 = new BusinessAdvantageplusAccount();
		BusinessAdvantageplusAccount account2 = new BusinessAdvantageplusAccount();
		
		account1.insertAccountDeatils(11111111l,"Mohammed Kamran","Raichur Branch","RCR7646GH",6000.0d);
		account2.insertAccountDeatils(2222222l, "Vinod", "Pune Branch","PUN455HG",60000.0d);
		
		account1.displayAccountDetails();
		account2.displayAccountDetails();
	}

}
