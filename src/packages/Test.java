package packages;

public class Test {

	int i;
	Test(int i)
	{
	this.i=i;
	}
	public static void main(String[]
	args){
	Test t1=new Test(10);
	Test t2=new Test(100);
	System.out.println(t1);
	System.out.println(t2);
}
	@Override
	public String toString() {
		return "Test [i=" + i + "]";
	}
}
