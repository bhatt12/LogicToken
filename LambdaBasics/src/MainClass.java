import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainClass {

	public static void main(String[] args) {
		
//		add(10, 0, (a, b) -> System.out.println(a / b));
		List<String> array = new ArrayList<String>();
		array.add("sandeep");
		array.add("pawan");
		array.add("sunidhi");
		array.add("geeta");
		array.add("ashish");
		
		
//		for(int offset = 0; offset < array.size(); offset++)
//		{
//			display(array.get(offset), System.out::println);
//		}
//		
//		for(String value : array)
//		{
//			display(value, System.out::println);
//		}
		
//		array.forEach(System.out::println);
		int b = 100;
		add(10, 20, (v, k) -> {
			//b=12;
			System.out.println(v+k+b);
		});
		array.parallelStream()
		.filter(value -> value.contains("p"))
		.forEach(System.out::println);
//		display(10, System.out::println); // (param1) -> System.out.println(param1)
		
	}
	
	public static void add(int value1, int value2, BiConsumer<Integer, Integer> consumer)
	{
		consumer.accept(value1, value2);
	}
	
	public static void display(String value, Consumer<String> consumer)
	{
		consumer.accept(value);
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer)
	{
		
		return (v,k)->
		{
			try
			{
				consumer.accept(v, k);
			}
			catch(Exception e)
			{
				System.out.println("Exception occurred");
			}
		};
	}

}