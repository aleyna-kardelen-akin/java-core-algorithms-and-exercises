package dairenin_alani_ve_cevresi;
import java.util.Scanner;

public class DaireninAlaniVeCevresi {

	public static void main(String[] args) {
		
		float yaricap,alan,cevre;
		final float PI = 3.14f;
		Scanner reader = new Scanner(System.in);
		System.out.print("Yaricapi giriniz: ");
		yaricap = reader.nextFloat();
		alan = PI*yaricap*yaricap;
		cevre = 2*PI*yaricap;
		System.out.printf("\nAlani --> %.2f\nCevre --> %.2f" ,alan,cevre);
		reader.close();
	}
}
