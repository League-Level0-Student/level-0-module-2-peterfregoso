package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		String numbers = "";
	
	
	for (int I = 5; I > 0; I--) {
		Random r = new Random();
		int num = r.nextInt(30);
		
		numbers += num;
		numbers += " ";
	}
	JOptionPane.showMessageDialog(null, numbers);
}
}
