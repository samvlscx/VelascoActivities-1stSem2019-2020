import javax.swing.JOptionPane;

public class Age1 {
    public static void main(String args[]) {

        String aG = "Age Group: ";
        

        while (true) {
            try {
				int age;
				String age1;
                age1 = JOptionPane.showInputDialog(null, "Enter your age: ");				
				if(age1==null){
					System.exit(0);
				}else if(age1 != null){
					age = Integer.parseInt(age1);
				//else if
                if (age > 0 && age <= 3) {
                    JOptionPane.showMessageDialog(null, aG + "Baby");
                    break;
                } else if (age > 4 && age <= 12) {
                    JOptionPane.showMessageDialog(null, aG + "Child");
                    break;
                } else if (age > 13 && age <= 19) {
                    JOptionPane.showMessageDialog(null, aG + "Teen");
                    break;
                } else if (age > 20 && age <= 32) {
                    JOptionPane.showMessageDialog(null, aG + "Young Adult");
                    break;
                } else if (age > 33 && age <= 45) {
                    JOptionPane.showMessageDialog(null, aG + "Middle Aged");
                    break;
                } else if (age > 46 && age <= 59) {
                    JOptionPane.showMessageDialog(null, aG + "Adult");
                    break;
                } else if (age > 60 && age <= 122) {
                    JOptionPane.showMessageDialog(null, aG + "Senior");
                    break;
                } else {                
                    JOptionPane.showMessageDialog(null, "---INVALID AGE---");
                }
                }
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "---NUMBER ONLY---");

            }
        }
    }
}