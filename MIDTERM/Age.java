import java.util.Scanner;

public class Age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
        int age;
        String aG = "Age Group: ";

        while (true) {
            try {
                System.out.println("Enter your age: ");
                age = sc.nextInt();

                if (age > 0 && age <= 3) {
                    System.out.println(aG + "Baby");
                    break;
                } else if (age > 4 && age <= 12) {
                    System.out.println(aG + "Child");
                    break;
                } else if (age > 13 && age <= 19) {
                    System.out.println(aG + "Teen");
                    break;
                } else if (age > 20 && age <= 32) {
                    System.out.println(aG + "Young Adult");
                    break;
                } else if (age > 33 && age <= 45) {
                    System.out.println(aG + "Middle Aged");
                    break;
                } else if (age > 46 && age <= 59) {
                    System.out.println(aG + "Adult");
                    break;
                } else if (age > 60 && age <= 122) {
                    System.out.print(aG + "Senior");
                    break;
                } else {
                    System.out.println("---INVALID AGE---");
                }

            } catch (Exception e) {
                System.out.println("---NUMBER ONLY---");
                sc.next();
            }
        }
    }
}