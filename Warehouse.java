package prob1;

public class Warehouse {
	private Item[] items = new Item[10];
	private int numItems = 0;
	
	public Warehouse() {
	}
	
	public void addItem(Item item) {
		if(numItems < 10) {
			items[numItems] = item;
			numItems++;
		}
	}
	
	public Item getItem(int i) {
		if(i >= 0 && i < numItems) {
			return items[i];
		}
		return null;
		
	}
	
	public Item getItem(String name) {
		for(int i = 0; i < numItems; i++) {
			if(items[i].getName().equals(name)) {
				return items[i];
			}
		}
		return null;
	}
	public int getNumItems() {
		return numItems;
		
	}
	public double getAverageTemp() {
		double avg = 0;
		double num =0;
		for(int i = 0; i < numItems; i++) {
			if(items[i] instanceof RefrigeratedItem) {
				avg += ((RefrigeratedItem) items[i]).getTemp();
				num++;
			}
		}
		if(num == 0) {
			return 0;
		}
		else {
			return avg / num;
		}
	}
	
	public RefrigeratedItem [] getRefrigeratedItems() {
		if(numItems==0) {
			return null;
		}
		int num = 0;
		for(int i = 0; i < numItems; i++) {
			if(items[i] instanceof RefrigeratedItem) {
				num++;
			}
		}
		RefrigeratedItem[] rItems = new RefrigeratedItem[num];
		for(int i = 0; i < numItems; i++) { {
			
		}
			if(items[i] instanceof RefrigeratedItem) {
				rItems[i] = (RefrigeratedItem) items[i];
				
			}
		}
		return rItems;
	}
	
	public double getTotalCost() {
		double totalCost = 0;
		for(int i = 0; i < numItems; i++) {
			totalCost += items[i].cost(totalCost);
		}
		return totalCost;
	
	}
	public Item removeItem(int i) {
		if(i>=0 && i < items.length) {
			Item removed = items[i];
			for(int j = i + 1; j < numItems; j++) {
				items[j-1] = items[j];
			}
			numItems--;
			return removed;
		}
		return null;
	}
	public Item removeItem(String name) {
		int num = 0;
		Item removedItem = null;
		for(int i = 0; i < numItems; i++) {
			if(items[i].getName().equals(name)) {
				removedItem = items[i];
				num = i;
			}
		}
		for(int i = num; i < numItems-1; i++) {
			items[i] = items[i+1];
		}
		return removedItem;
	}
	
	public String toString() {
		String s = "";
		for(int i =0; i < numItems; i++) {
			s += items[i].toString();
			s += "\n";
		}
		return s;
	}
		
	
}
