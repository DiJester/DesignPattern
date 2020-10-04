package visitor;

public class Memory extends ComputerPart{

	public Memory(int p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitMemory(this);
	}
   
}
