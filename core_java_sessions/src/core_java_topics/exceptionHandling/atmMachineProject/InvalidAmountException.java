package core_java_topics.exceptionHandling.atmMachineProject;

public class InvalidAmountException extends Exception{

	public InvalidAmountException(String errorMsg) {
		super(errorMsg);
	}
}
