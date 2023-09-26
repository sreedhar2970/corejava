package core_java_topics.collectionFramework.setInterface.linkedHashSet.realtime;

import java.util.Objects;

public class CreditCards {

	long cc_num;
	String cc_holder_name;
	String expiry_date;
	int cvv_num;
	double cc_limit;
	
	public CreditCards(long cc_num, String cc_holder_name, String expiry_date, int cvv_num, double cc_limit) {
		super();
		this.cc_num = cc_num;
		this.cc_holder_name = cc_holder_name;
		this.expiry_date = expiry_date;
		this.cvv_num = cvv_num;
		this.cc_limit = cc_limit;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cc_num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCards other = (CreditCards) obj;
		return cc_num == other.cc_num;
	}
	@Override
	public String toString() {
		return "CreditCards [cc_num=" + cc_num + ", cc_holder_name=" + cc_holder_name + ", expiry_date=" + expiry_date
				+ ", cvv_num=" + cvv_num + ", cc_limit=" + cc_limit + "]";
	}
}
