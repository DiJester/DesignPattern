package observer.guiExample;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUITest extends Frame{
	

	public void launch() {
		
	    Button b = new Button("Press Me");
	    b.addActionListener(new MyActionListener());
	    b.addActionListener(new MyActionListener1());
	    this.add(b);
	    this.pack();
	    this.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		System.exit(0);
	    	}
	    });
	    this.setSize(300,100);
	    this.setLocation(400,400);
	    this.setVisible(true);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GUITest g = new GUITest();
      g.launch();
	}

}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button clicked.");
	}
	
}
class MyActionListener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button pressed.");
	}
	
}