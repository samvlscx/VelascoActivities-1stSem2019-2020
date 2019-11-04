import java.util.Scanner;
public class ArraySample{
	public static void main(String [] args){
		/*int[] ages = new int[100];
		for(int i=0; i<100; i++){
			System.out.println(ages[i]);
		
		String shapes[] = {"Circle", "Square", "Rectangle", "Triangle"};
		for(int i=0; i<shapes.length; i++){
			System.out.println(shapes[i]);
		}*/
		double avg=0;
		int passedCtr = 0, failedCtr=0, noStud, finGrade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		noStud = sc.nextInt();
			for (int i=1; i <= noStud; i++){
				System.out.print("Enter final grade of student " + i + ": ");
				finGrade = sc.nextInt();
				if(finGrade >= 75 && finGrade <= 99)
					passedCtr++;
				else if(finGrade >= 70 && finGrade <= 74 )
					failedCtr++;
				else{
					System.out.println("Invalid Input");
					i--;
				}
				avg+=finGrade;
			}
			System.out.println("Average Grade: " + avg/noStud);
			System.out.println("Passed: " + passedCtr);
			System.out.println("Failed: " + failedCtr);
	}
}