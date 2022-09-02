package prob1;

public class Item {
	protected String name;
	protected double weight;
	
	
	
	public Item (String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
		
	}
	public double getWeight() {
		return weight;
	}
	public double cost(double weight) {
		double cost = (this.weight * 2);
		return cost;
		
	}
	
	//@overrides
	public String toString() {
		String s = "name=" + getName() + ", cost=" + String.format("$%.2f",cost(weight)) + ", weight=" + String.format("%.2f",this.getWeight());
		return s;
		
	}
}
