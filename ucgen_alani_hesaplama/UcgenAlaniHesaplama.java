package ucgen_alani_hesaplama;
import java.util.Scanner;

public class UcgenAlaniHesaplama {

	public static void main(String[] args) {
		
		int k1,k2;
		float alan,aci;
		Scanner reader = new Scanner(System.in);
		System.out.print("Ucgenin kenar uzunlularini giriniz: ");
		k1 = reader.nextInt();
		k2 = reader.nextInt();
		System.out.print("Ucgenin acisini giriniz: ");
		aci = reader.nextFloat();
		alan = (float)(0.5f*k1*k2*Math.sin(Math.toRadians(aci)));
		System.out.printf("Ucgenin Alani --> %.2f",alan);
		reader.close();
	}
}
