package composite;

//组合模式是树状结构专用模式

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BranchNode root = new BranchNode("root");
        BranchNode ch1 = new BranchNode("Chapter1");
        LeafNode leaf11 = new LeafNode("Leaf1.1");
        LeafNode leaf12 = new LeafNode("Leaf1.2");
        BranchNode ch2 = new BranchNode("Chapter2");
        BranchNode sec21 = new BranchNode("Section2.1");
        LeafNode leaf211 = new LeafNode("Leaf2.1.1");
        LeafNode leaf212 = new LeafNode("Leaf2.1.2");
        root.addNode(ch1);
        ch1.addNode(leaf11);
        ch1.addNode(leaf12);
        root.addNode(ch2);
        ch2.addNode(sec21);
        sec21.addNode(leaf211);
        sec21.addNode(leaf212);
         printTree(root,0);
	}
	
	public static void printTree(Node root,int depth) {
		for(int i =0;i<depth;i++)
			System.out.print("-");
		root.printName();
		if(root instanceof BranchNode)
		{
			depth++;
			for(int i=0; i<((BranchNode)root).getListLength();i++)
			{
				printTree(((BranchNode) root).getNode(i),depth);
			}
		}
	}	
}
