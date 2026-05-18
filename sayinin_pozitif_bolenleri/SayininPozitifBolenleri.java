package sayinin_pozitif_bolenleri;
import java.util.Scanner;

public class SayininPozitifBolenleri {

	public static void main(String[] args) {
		
		int i,sayi;
		Scanner reader = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		sayi = reader.nextInt();
		System.out.print("\nGirdiginiz Sayinin Bolenleri -> ");
		for(i=1;i<sayi+1;i++)
		{
			if(sayi%i==0)
				System.out.print(" "+i);
		}
		reader.close();
	}
}
