package Examples.Singleton;

public class SingletonPatternExample {
	public static void main(String[] a) {
		SingletonClass singletonClass = SingletonClass.getInstance();
		singletonClass.getMessage("hello singleton");
	}
}
