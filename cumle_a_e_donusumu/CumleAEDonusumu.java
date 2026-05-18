package cumle_a_e_donusumu;
import java.util.Scanner;

public class CumleAEDonusumu {

	public static void main(String[] args) {
		
		String cumle,new_cumle,bosluk_sil;
		Scanner reader = new Scanner(System.in);
		System.out.print("Bir cumle giriniz: ");
		cumle = reader.nextLine();
		new_cumle = cumle.replace('a', 'e').replace('A', 'E');
		bosluk_sil = new_cumle.replaceAll("\\s+", "");
		System.out.println("\nYeni Metin --> " + bosluk_sil);
		reader.close();
	}
}
