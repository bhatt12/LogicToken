package examples;

public class Test4 {

	private Test3 test3;
	
	public Test3 getTest3() {
		return test3;
	}

	public void setTest3(Test3 test3) {
		this.test3 = test3;
	}
	
	public void getMessage() {
		test3.getExternalMessage();
	}
}
