package prob1;

public class RefrigeratedItem extends Item {
	protected double temp;
	
	
	public RefrigeratedItem (String name, double weight, double temp) {
		super(name,weight);
		this.temp = temp;
		
	}
	
	public RefrigeratedItem(Item item, double temp) {
		this(item.name, item.weight, temp);
		
	}
	public double getTemp() {
		return this.temp;
		
	}
	public double cost() {
		double cost = (2 * this.weight + (100-this.temp) * 0.1);
		return cost;
		
	}
	
	public String toString() {
		return super.toString() + ", temp=" + String.format("%.2f", this.getTemp()) +"degrees";
		
	}
	

}
