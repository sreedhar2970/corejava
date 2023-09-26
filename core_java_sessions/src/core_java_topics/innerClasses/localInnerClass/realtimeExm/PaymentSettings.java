package core_java_topics.innerClasses.localInnerClass.realtimeExm;

public class PaymentSettings {

	private long cell_number = 7207513883l;
	private String cust_name = "Mohammed Kamran";
	private String city = "Raichur City";
	
	public void airtelPaymentBank() {
		class AirtelPaymentSettings{
			void displayAirtelSettingsInfo() {
				System.out.println("Airtel Payment Bank Number : " + cell_number);
				System.out.println("Airtel Payment Bank Customer Name : " + cust_name);
				System.out.println("Customer City : " + city);
				System.out.println("=============================================================");
			}
		}
		AirtelPaymentSettings airtel = new AirtelPaymentSettings();
		airtel.displayAirtelSettingsInfo();
	}
	
	public void paytmWalletSettings() {
		class PaytmWallet{
			void paytmSettingInfo() {
				System.out.println("Paytm Number : " + cell_number);
				System.out.println("Paytm Customer Name : " + cust_name);
				System.out.println("Customer City : " + city);
				System.out.println("===============================================================");
			}
		}
		PaytmWallet paytm = new PaytmWallet();
		paytm.paytmSettingInfo();
	}
	
	public void amazonWalletSettings() {
		class AmazonWallet{
			void amazonSettingInfo() {
				System.out.println("Amazon Customer Number : " + cell_number);
				System.out.println("Amazon Customer Name : " + cust_name);
				System.out.println("Customer City : " + city);
			}
		}
		AmazonWallet amazon = new AmazonWallet();
		amazon.amazonSettingInfo();
	}
	
	public static void main(String[] args) {
		
		PaymentSettings settings = new PaymentSettings();
		settings.airtelPaymentBank();
		settings.paytmWalletSettings();
		settings.amazonWalletSettings();
	}
}



