package core_java_topics.keywords.thisKeyword.currentClassInstanceVariable;

import core_java_topics.keywords.thisKeyword.problemwithoutThisKeyword.BOFACustomizedCashRewadCard;

public class BOFACustomizedCashRewardCardDetails {

	public static void main(String[] args) {

		BOFACustomizedCashRewadCard card1 = new BOFACustomizedCashRewadCard(4567l, "Ramesh","23-09-2029",80000.0d, 8967, 345);
		BOFACustomizedCashRewadCard card2 = new BOFACustomizedCashRewadCard(7346l, "Mohan","25-09-2030",90000.0d, 9457, 674);
		card1.displayCCDetails();
		card2.displayCCDetails();
	}
}
