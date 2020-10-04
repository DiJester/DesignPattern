package visitor;

public class Computer {

	private CPU cpu;
	private Memory memory;
	private Board board;
	public Computer(CPU c, Memory m, Board b) {
		this.cpu=c;
		this.memory=m;
		this.board=b;
	}
	public void accept(Visitor v) {
		this.cpu.accept(v);
		this.memory.accept(v);
		this.board.accept(v);
	}
}