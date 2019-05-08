//import java.util.Scanner;
import javax.swing.*;
//import java.math.*;
public class box {
	public static void main(String [] args)
	{
		double r,a;
		String s;
		
		//Scanner x = new Scanner(System.in);
		s=JOptionPane.showInputDialog(null,"Enter radius","Input Box",JOptionPane.QUESTION_MESSAGE);
	    r = Double.parseDouble(s);
	    a = Math.PI*r*r;
		JOptionPane.showMessageDialog(null,"The area is "+a,"output box",JOptionPane.INFORMATION_MESSAGE);
	
		
	}

}
