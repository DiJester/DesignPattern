package composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {

	private List<Node> list;
	public BranchNode(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		list = new ArrayList<Node>();
	}
	public void addNode(Node n) {
		this.list.add(n);
	}
	public int getListLength() {
		return list.size();
	}
	public void removeNode(int index) {
		this.list.remove(index);
	}	
	public Node getNode(int index) {
		return list.get(index);
	}
}
