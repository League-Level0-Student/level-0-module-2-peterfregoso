package random;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String b;
	b = JOptionPane.showInputDialog("how TALL ARE YOU (in inches)");
		int i=Integer.parseInt(b);
	if(i < 48) {
	
	
	JOptionPane.showMessageDialog(null, " you can go on");
	
	
	
	}
	else {
		
		
		JOptionPane.showMessageDialog(null, "sorry you can't go on");
	}
	
}
}
