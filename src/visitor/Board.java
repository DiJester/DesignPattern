package visitor;

public class Board extends ComputerPart{

	public Board(int p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visitBoard(this);
	}

}
