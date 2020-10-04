package visitor;

public class VisitorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ComputerPart [] parts = {new CPU(1100),new Memory(280),new Board(800)};
        Visitor[] visitors = {new Student(),new Corp()};
        for(int i = 0; i <visitors.length; i++)
        {
        	for(int j = 0; j <parts.length; j++)
        		parts[j].accept(visitors[i]);
            System.out.println(visitors[i].getTotalPrice());
        }
        
        Computer c = new Computer(new CPU(2300),new Memory(300),new Board(1200));
        Student s  = new Student();
        c.accept(s);
        System.out.println(s.getTotalPrice());
	}

}
