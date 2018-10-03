package Examples.FactoryPattern;

public class Icecream implements Dessert,MyInterface{

	@Override
	public void getSweetDish() {
		System.out.println("Please have Icecream!!");
	}

	@Override
	public MyInterface getInstance() {
		// TODO Auto-generated method stub
		return new Icecream();
	}
	
	public Icecream()
	{
		
	}

}
