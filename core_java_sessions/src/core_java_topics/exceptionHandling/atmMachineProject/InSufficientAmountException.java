package core_java_topics.exceptionHandling.atmMachineProject;

public class InSufficientAmountException extends Exception{

	public InSufficientAmountException(String errorMsg) {
		super(errorMsg);
	}
}
