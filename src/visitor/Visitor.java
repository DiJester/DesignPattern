package visitor;

public interface Visitor {
     public void visitCPU(CPU c);
     public void visitMemory(Memory m);
     public void visitBoard(Board b);  
     public double getTotalPrice();
}
