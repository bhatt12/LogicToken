package examples;

public class Test1 {

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	int value1;
	String value2;
	private Test3 test3;
	
	public Test3 getTest3() {
		return test3;
	}

	public void setTest3(Test3 test3) {
		this.test3 = test3;
	}

	public void getValues() {
		System.out.println("Value1 : " + value1 + ", Value2 : " + value2);
	}
	
	public void getMessage() {
		test3.getExternalMessage();
	}
}
