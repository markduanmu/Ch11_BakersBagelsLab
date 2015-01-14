public class BakersDozen extends BagelsOrderItem{
	public BakersDozen(double p1, int q1) {
		super(p1, 13);
	}
	public double getCost(){
		return super.getPrice() * 12;
	}
}

