package visitor;

public abstract class ComputerPart {
	private double price;
	public ComputerPart(int p) {
		price = p;
	}
	public double getPrice() {
		return this.price;
	}
    public abstract void accept(Visitor v);
}
