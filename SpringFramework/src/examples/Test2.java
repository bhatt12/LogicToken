package examples;

public class Test2 {

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

	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}

	int value1;
	String value2;
	String value3;
	
	public void getValues() {
		System.out.println("Value1 : " + value1 + ", Value2 : " + value2 + ", Value3: " + value3);
	}
}
