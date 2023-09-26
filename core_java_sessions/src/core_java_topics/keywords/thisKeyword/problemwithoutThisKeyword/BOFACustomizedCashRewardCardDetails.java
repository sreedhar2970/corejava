package core_java_topics.keywords.thisKeyword.problemwithoutThisKeyword;

public class BOFACustomizedCashRewardCardDetails {

	public static void main(String[] args) {

		BOFACustomizedCashRewadCard card1 = new BOFACustomizedCashRewadCard(1234l, "Sheik","23-09-2030",50000.0d, 7845, 888);
		BOFACustomizedCashRewadCard card2 = new BOFACustomizedCashRewadCard(1236l, "Vamshi","16-09-2033",70000.0d, 5443, 342);
		card1.displayCCDetails();
		card2.displayCCDetails();
	}

}
