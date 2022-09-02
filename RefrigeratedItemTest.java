package prob1;

public class RefrigeratedItemTest {

	public static void main(String[] args) {
		testConstructorMain();
		testConstructorAcceptsItem();
		testItemCost();
		testToString();
	}
	
	/**
	 * Verify that the name, weight, & temp are initialized with the main constructor.
	 */
	public static void testConstructorMain() {
		System.out.println("-->testConstructorMain"); 
		RefrigeratedItem iceCream1 = new RefrigeratedItem("Ice Cream" , 1.00, 20.00);
		System.out.println(iceCream1.getName());
		System.out.println(iceCream1.getWeight());
		System.out.println(iceCream1.getTemp());
		System.out.println(iceCream1);
	}

	/**
	 * Verify that the name, weight, & temp are initialized with the second constructor.
	 */
	public static void testConstructorAcceptsItem() {
		System.out.println("-->testConstructorAcceptsItem");
		Item item1 = new Item("Ice Cream" , 1.00);
		RefrigeratedItem iceCream2 = new RefrigeratedItem(item1, 20.00);
		System.out.println(iceCream2.getName());
		System.out.println(iceCream2.getWeight());
		System.out.println(iceCream2.getTemp());
	}

	/**
	 * Verify that the cost method works correctly.
	 */
	public static void testItemCost() {
		System.out.println("-->testItemCost"); 
		RefrigeratedItem iceCream3 = new RefrigeratedItem("Ice Cream", 1.00, 20.00);
		System.out.println(iceCream3.cost());
		
	}

	/**
	 * Verify that the toString method produces a string exactly
	 * as specified in the assignment document. 
	 */
	public static void testToString() {
		System.out.println("-->testToString"); 
		RefrigeratedItem iceCream4 = new RefrigeratedItem(" Ice Cream", 1.00, 20.00);
		System.out.println("Expected name =Ice Cream, cost=$10.00, weight=1.00, temp=20.00 degrees ");
		System.out.println("Actual " + iceCream4);
	}

}
