package random;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age;
	age= JOptionPane.showInputDialog("How old are you?");
	int i =Integer.parseInt(age);
if(i <18) {
	
	JOptionPane.showMessageDialog(null, "you are  the best");
}
else {
	
	JOptionPane.showMessageDialog(null, "Who did youuu vote for");
	
}
}
}

