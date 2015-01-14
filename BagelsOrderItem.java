public class BagelsOrderItem {
	
	private double price;
	private int quantity;
	public BagelsOrderItem(double p1, int q1){
		price = p1;
		quantity = q1;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
	public double getCost(){
		return (price * quantity);
	}
}