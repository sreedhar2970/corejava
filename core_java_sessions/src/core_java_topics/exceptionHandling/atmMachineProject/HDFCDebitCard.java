package core_java_topics.exceptionHandling.atmMachineProject;

public class HDFCDebitCard implements IATMService{

	private double balance;{
		this.balance = 10000.0d;
	}
	@Override
	public void depositAmount(double deptAmt) throws InvalidAmountException {
		if(deptAmt<=0) {
			throw new InvalidAmountException("Invalid Amount : Please don't enter invalid amount");
		}else {
			balance = balance + deptAmt;
		}
	}
	@Override
	public double withdrawAmount(double withdrawAmt) throws InvalidAmountException, InSufficientAmountException {
		if(withdrawAmt<=0) {
			throw new InvalidAmountException("Invalid Amount : Please don't enter invalid amount");
		}else if(balance<withdrawAmt) {
			throw new InSufficientAmountException("In-Sufficient Amount : Please check your balance");
		}
			balance = balance - withdrawAmt;
			return balance;
	}

	@Override
	public double checkBalance() {
		return balance;
	}

}
