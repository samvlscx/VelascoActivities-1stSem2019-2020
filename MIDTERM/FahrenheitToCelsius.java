import java.util.Scanner;
public class FahrenheitToCelsius{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit: ");
		double Fahrenheit = sc.nextDouble();
		
		double Celsius = (Fahrenheit-32)*5/9;
		
		System.out.println("Celsius: " + Celsius);
		
		}
	}
