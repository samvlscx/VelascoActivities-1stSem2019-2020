import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Shapes{
	public static void main(String[] args){
		
		DecimalFormat df = new DecimalFormat("0.00"); 
		double radius=0, aC=0, side, height, width;
		
		
		Object[] shapeChoices = {"Circle", "Square", "Rectangle", "Triangle"};
		String initialSelection1 = "Select---";
						
		Object shape = JOptionPane.showInputDialog(null, "Choose a shape: ",JOptionPane.QUESTION_MESSAGE, shapeChoices, initialSelection1);
		
		
		}	
}