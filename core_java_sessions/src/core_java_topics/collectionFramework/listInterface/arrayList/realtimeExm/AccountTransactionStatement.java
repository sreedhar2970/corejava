package core_java_topics.collectionFramework.listInterface.arrayList.realtimeExm;

public class AccountTransactionStatement {

	private long reference_num;
	private String payee_name;
	private String trans_date;
	private double amount;
	
	public AccountTransactionStatement(long reference_num, String payee_name, String trans_date, double amount) {
		super();
		this.reference_num = reference_num;
		this.payee_name = payee_name;
		this.trans_date = trans_date;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AccountTransactionStatement [reference_num=" + reference_num + ", payee_name=" + payee_name
				+ ", trans_date=" + trans_date + ", amount=" + amount + "]";
	}
	
}
