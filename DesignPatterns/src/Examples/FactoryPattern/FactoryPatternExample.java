package Examples.FactoryPattern;

import java.lang.reflect.InvocationTargetException;

public class FactoryPatternExample {
	public static void main(String[] a) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
//		DessertFactory dessertFactory = new DessertFactory();
//		
//		Dessert dessert1 = dessertFactory.getDessert("Cake");
//		dessert1.getSweetDish();
//		
//		Dessert dessert2 = dessertFactory.getDessert("icecream");
//		dessert2.getSweetDish();
//		
//		Dessert dessert3 = dessertFactory.getDessert("pudding");
//		dessert3.getSweetDish();
		
		MyInterface obj = DessertFactory.getFromFactory(Icecream.class.getName());
		System.out.println("");
	}
	
}

interface MyInterface{
	public MyInterface getInstance();
}