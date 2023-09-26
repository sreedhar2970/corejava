package core_java_topics.innerClasses.anonymousInnerClass;

public class TestAnonymousInnerClass {

	public static void main(String[] args) {

		ITransferService service = new ITransferService() {
			
			@Override
			public void thirdPartypayment() {
				System.out.println("=== This is a third party transfer ===");
			}
			
			@Override
			public void impsTransfer() {
				System.out.println("=== This is IMPS Transfer ===");
			}
		};
		service.thirdPartypayment();
		service.impsTransfer();
	}

}
