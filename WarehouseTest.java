package prob1;

public class WarehouseTest {

	public static void main(String[] args) {
		testAddItem();
		testAddItem_Multiple();
		testGetItem_WithIndex();
		testGetItem_WithName();
		testGetAverageTemp();
		testGetRefrigeratedItems();
//		testGetTotalCost();
//		testGetTotalCostRefrigerated();
//		testRemoveItem_WithIndex();
//		testRemoveItem_WithName();
//		testToString();
	}
	//test to add Item 
	public static void testAddItem() {
		System.out.println("-->testAddItem"); 
		Item softDrink = new Item("Soda", 5.8);
		Warehouse homeDepot = new Warehouse();
		homeDepot.addItem(softDrink);
		System.out.println("Expected: Number of items=1\nActual: Number of items=" + homeDepot.getNumItems());
	}
	/**
	 * Add three items and check the number of items to verify. At least one should be a refrigerated item.
	 */
	public static void testAddItem_Multiple() {
		System.out.println("\n-->testAddItem_Multiple"); 
		Warehouse homeDepot = new Warehouse();
		Item w1 = new Item("cereal",4.0);
		Item s1 = new Item("milk",5.9);
		Item s2 = new Item("salt",8.0);
		homeDepot.addItem(w1);
		homeDepot.addItem(s1);
		homeDepot.addItem(s2);
		System.out.println("Expected: Number of items=3\nActual: Number of items=" + homeDepot.getNumItems());
	}
	
	//test to get Item at a certain index 
	public static void testGetItem_WithIndex() {
		System.out.println("\n-->testGetItem_WithIndex"); 
		Warehouse homeDepot = new Warehouse();
		Item b1 = new Item("tomato",1.0);
		Item b2 = new Item("eggs",3.0);
		Item b3 = new Item("shredded cheese",6.2);
		homeDepot.addItem(b1);
		homeDepot.addItem(b2);
		homeDepot.addItem(b3);
		System.out.println("Expected: Item=eggs");
		System.out.println("Actual: Item=" + homeDepot.getItem(1).getName());
	}
	// test to get an item with a certain name 
	public static void testGetItem_WithName() {
		System.out.println("\n-->testGetItem_WithName"); 
		Warehouse homeDepot = new Warehouse();
		Item c1 = new Item("tomato",1.0);
		Item c2 = new Item("grape",3.0);
		Item c3 = new Item("shredded cheese",6.2);
		homeDepot.addItem(c1);
		homeDepot.addItem(c2);
		homeDepot.addItem(c3);
		System.out.println("Expected: Item=grape");
		System.out.println("Actual: Item=" + homeDepot.getItem("grape").getName());
	}

	//test RefrigeratedItem grab their temp and find the average 
	public static void testGetAverageTemp() {
		System.out.println("\n-->testGetAverageTemp"); 
		Warehouse homeDepot = new Warehouse();
		Item c1 = new RefrigeratedItem("tomato",10.0, 46.90);
		Item c2 = new RefrigeratedItem("grape",3.0, 46.90);
		Item c3 = new RefrigeratedItem("shredded cheese", 3.0,46.90);
		Item b1 = new RefrigeratedItem("tomato",1.0, 46.90);
		Item b2 = new RefrigeratedItem("eggs",3.0, 46.90);
		homeDepot.addItem(c1);
		homeDepot.addItem(c2);
		homeDepot.addItem(c3);
		homeDepot.addItem(b1);
		homeDepot.addItem(b2);
		System.out.println("Expected: average=46.90");
		System.out.printf("Actual: average=%.2f\n", homeDepot.getAverageTemp());
	}
	
	// Add 5 items, 3 of which are refrigerated. Verify that the 3 are returned in array.
	public static void testGetRefrigeratedItems() {
		System.out.println("\n-->testGetRefrigeratedItems");
		Warehouse homeDepot = new Warehouse();
		
		RefrigeratedItem butter = new RefrigeratedItem("butter", 3.43, 34.5);
		Item soda = new Item("soda", 5.43);
		RefrigeratedItem eggs = new RefrigeratedItem("eggs", 1.34, 32);
		RefrigeratedItem water = new RefrigeratedItem("water", 3.23, 43.2);
		Item pickels = new Item("pickels", 7.43);
		homeDepot.addItem(butter);
		homeDepot.addItem(soda);
		homeDepot.addItem(eggs);
		homeDepot.addItem(water);
		homeDepot.addItem(pickels);
		int num = 0;
		if(items[i] instanceof RefrigeratedItem) {
			num++;
		RefrigeratedItem[] rItems = new RefrigeratedItem[num]
		return rItem;
	
		System.out.println("Expected:\nName:butter\nName:eggs\nName:water\n\nActual:");
		
	}
	//Add 5 items, 3 of which are refrigerated. Verify the total cost.

//	public static void testGetTotalCost() {
//		System.out.println("\n-->testGetTotalCostRefrigerated"); 
//		Warehouse homeDepot = WarehouseTest.createsWarehouseWith5Items(); 
//		double expectedCost = 34.17;
//		System.out.println("Expected: Cost:$" + expectedCost + "\nActual: Cost:$" + homeDepot.getTotalCost());
//	}
//
//	//Add 5 items, 3 of which are refrigerated. Verify the total cost of the 3 refrigerated items
//	public static void testGetTotalCostRefrigerated() {
//		System.out.println("\n-->testGetTotalCostRefrigerated"); 
//		Warehouse homeDepot = WarehouseTest.createsWarehouseWith5Items(); 
//		double expectedCost = 22.79;
//		System.out.printf("Expected: Cost:$" + expectedCost + "\nActual: Cost:$%.2f", homeDepot.getTotalCostRefrigerated());
//	}
//
//	//Add 5 items, 3 of which are refrigerated. Remove the one at position 2 and 
//	//verify: the item is returned, and the number of items is decremented.
//	public static void testRemoveItem_WithIndex() {
//		System.out.println("\n-->testRemoveItem_WithIndex"); 
//		Warehouse homeDepot = WarehouseTest.createsWarehouseWith5Items();
//		int location = 2;
//		int expectedNumItems = 4;
//		String expectedRemoved = "tortilla";
//		Item unwanted = homeDepot.removeItem(location);
//		String unwantedItemName = unwanted == null? "null" : unwanted.getName();
//		
//		System.out.println("Expected: Number of Items:" + expectedNumItems + ", Removed Item Name:" + expectedRemoved);
//		System.out.println("Actual: Number of Items:" + homeDepot.getNumItems() + ", Removed Item Name:" + unwantedItemName);
//		
//		
//		
//	}
//
//	//Add 5 items, 3 of which are refrigerated. Remove one with a name that exists and 
//	// verify: the item is returned, and the number of items is decremented.
//	
//	public static void testRemoveItem_WithName() {
//		System.out.println("\n-->testRemoveItem_WithName"); 
//		Warehouse homeDepot = WarehouseTest.createsWarehouseWith5Items();
//		String location = "beef";
//		int expectedNumItems = 4;
//		String expectedRemoved = "beef";
//		Item unwanted = homeDepot.removeItem(location);
//		String unwantedItemName = unwanted == null? "null" : unwanted.getName();
//		
//		System.out.println("Expected: Number of Items:" + expectedNumItems + ", Removed Item Name:" + expectedRemoved);
//		System.out.println("Actual: Number of Items:" + homeDepot.getNumItems() + ", Removed Item Name:" + unwantedItemName);
//		
//		
//	}
//
//	//Verify that the toString method produces a string exactly
//	// as specified in the assignment document. 
//	public static void testToString() {
//		System.out.println("\n-->testToString"); 
//		Warehouse homeDepot = WarehouseTest.createsWarehouseWith5Items();
//		
//		System.out.println(homeDepot.toString());
//	}
//	
//	/*
//	 * Helper Methods
//	 */
//	public static Warehouse createsWarehouseWith3Items() {
//		Warehouse homeDepot = new Warehouse();
//		
//		Item strawberry = new Item("strawberry", 5.33);
//		RefrigeratedItem beef = new RefrigeratedItem("beef", 4.00, 23);
//		Item mayo = new Item("mayo", 5.56);
//		
//		homeDepot.addItem(strawberry);
//		homeDepot.addItem(beef);
//		homeDepot.addItem(mayo);
//		
//		return homeDepot;
//	}
//	
//	
//	public static Warehouse createsWarehouseWith5Items() {
//		Warehouse homeDepot = new Warehouse();
//		
//		RefrigeratedItem butter = new RefrigeratedItem("butter", 3.43, 34.5);
//		Item soda = new Item("soda", 5.43);
//		RefrigeratedItem eggs = new RefrigeratedItem("eggs", 1.34, 32);
//		RefrigeratedItem water = new RefrigeratedItem("water", 3.23, 43.2);
//		Item pickels = new Item("pickels", 7.43);
//		
//		homeDepot.addItem(butter);
//		homeDepot.addItem(soda);
//		homeDepot.addItem(eggs);
//		homeDepot.addItem(water);
//		homeDepot.addItem(pickels);
//		
//		return homeDepot;
//	}

}
