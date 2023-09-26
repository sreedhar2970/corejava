package core_java_topics.abstraction.interfaceExm2;

public class TransferDetailsApp implements IVisaCardPay{

	public static void main(String[] args) {
		TransferDetailsApp app = new TransferDetailsApp();
		app.transferWithInBank();
		app.impsTransfer();
		app.visaCardPay();
		app.neftTransfer();
	}

	@Override
	public void transferWithInBank() {
		System.out.println("This is within bank Transfer....");
	}

	@Override
	public void impsTransfer() {
		System.out.println("This is IMPS Transfer....");
	}

	@Override
	public void neftTransfer() {
		System.out.println("This is NEFT Transfer......");
	}

	@Override
	public void visaCardPay() {
		System.out.println("This Visa Card Transfer");
	}

}
