package Examples.Singleton;

public class SingletonClass {

	private static SingletonClass singletonInstance = new SingletonClass();
	
	private SingletonClass() {	}
	
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	public void getMessage(String msg) {
		System.out.println(msg);
	}
}
