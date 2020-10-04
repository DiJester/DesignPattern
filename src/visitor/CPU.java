package visitor;

public class CPU extends ComputerPart{

	public CPU(int p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitCPU(this);
	}

}
