package visitor;

public class Student implements Visitor {
	private double totalPrice = 0;

	@Override
	public void visitCPU(CPU c) {
		// TODO Auto-generated method stub
		totalPrice = totalPrice + c.getPrice()*0.75;
	}

	@Override
	public void visitMemory(Memory m) {
		// TODO Auto-generated method stub
		totalPrice = totalPrice + m.getPrice()*0.80;
	}

	@Override
	public void visitBoard(Board b) {
		// TODO Auto-generated method stub
		totalPrice = totalPrice + b.getPrice()*0.70;
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return totalPrice;
	}

}
