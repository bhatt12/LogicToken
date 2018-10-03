package Examples.FactoryPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.Clock;

import org.apache.commons.lang.time.StopWatch;

public class DessertFactory {
	public Dessert getDessert(String DessertType) {
		if(DessertType == null) {
			return null;
		}
		if(DessertType.equalsIgnoreCase("Cake")) {
			return new Cake();
		}
		else if(DessertType.equalsIgnoreCase("Icecream")){
			return new Icecream();
		}
		else if(DessertType.equalsIgnoreCase("Pudding")) {
			return new Pudding();
		}
		return null;
	}
	
	public static MyInterface getFromFactory(String className) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException
	{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Class<?> classReference = Class.forName(className);
		Constructor<MyInterface> x = (Constructor<MyInterface>) classReference.getConstructor();
		x.newInstance().getInstance();
		for(int i : new int[] {1,1,1,1,1,1,1,1,1,1,1,10})
		{
			System.out.println(i);
		}
		stopWatch.stop();
		System.out.println(stopWatch.getTime());
		return null;
	}
}
