package prob1;

public class ItemTest {

	public static void main(String[] args) {
		testConstructor();
		testItemCost();
		testToString();
	}
	
	/**
	 * Verify that the name & weight are initialized with the constructor.
	 */
	public static void testConstructor() {
		System.out.println("-->testConstructor");
		Item Item1 = new Item("Crackers", 2.25);
		System.out.println(Item1.getName());
		System.out.println(Item1.getWeight());
	
	}

	/**
	 * Verify that the cost method works correctly.
	 */
	public static void testItemCost() {
		System.out.println("-->testItemCost");
		Item item2 = new Item("crackers",2.25);
		System.out.println("Expected cost $4.50");
		System.out.println("Actual cost " +  String.format("$%.2f",item2.cost(0)));
		
	}

	/**
	 * Verify that the toString method produces a string exactly
	 * as specified in the assignment document. 
	 */
	public static void testToString() {
		System.out.println("-->testToString"); 
		Item item3 = new Item("Crackers",2.25);
		System.out.println("expected name=crackers, cost=$4.50, weight=2.25");
		System.out.println("Actual " + item3);

	}

}
