package core_java_topics.exceptionHandling.atmMachineProject;

public interface IATMService {

	public void depositAmount(double deptAmt)
			throws InvalidAmountException;
	public double withdrawAmount(double withdrawAmt)
			throws InvalidAmountException, InSufficientAmountException;
	
	public double checkBalance();
}
