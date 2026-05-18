package fahrenheite_celcius_donusumu;
import java.util.Scanner;

public class FahrenheiteCelciusDonusumu {

	public static void main(String[] args) {
		
		float Celcius,Fahrenheite;
		Scanner reader = new Scanner(System.in);
		System.out.print("Celcius olarak sicakligi giriniz: ");
		Celcius = reader.nextFloat();
		Fahrenheite = 1.8f * Celcius + 32;
		System.out.printf("\n%.2f Celsius = %.2f Fahrenheit\n", Celcius, Fahrenheite);
		reader.close();
	}
}
