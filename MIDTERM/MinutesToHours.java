import javax.swing.JOptionPane;
public class MinutesToHours{
	public static void main(String[]args){
		int Minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "***Minutes to Hours Calculator***\n" + "Enter Minutes: "));
		
		int hours = Minutes/60;
		int hoursM = Minutes%60;
		
		JOptionPane.showMessageDialog(null, hours + " hours and " + hoursM + " minutes ");
		}
	}