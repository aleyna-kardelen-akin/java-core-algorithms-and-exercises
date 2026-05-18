package bir_sinif_uc_nesne;
import java.util.Scanner;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		SmartPhone nesne1 = new SmartPhone("Samsung","S23","Beyaz",128,2.0f);
		
		nesne1.bilgileri_yazdir();
		System.out.println(nesne1.hafiza_degerlendir());
		
		SmartPhone nesne2 = new SmartPhone("Xiaomi","Redmi Note 10","Mavi",64,1.9f);
		
        nesne2.bilgileri_yazdir(); 
        System.out.println(nesne2.hafiza_degerlendir());
        
        SmartPhone nesne3 = new SmartPhone(" "," "," ",0,0.0f);
        
        System.out.print("\nNesne3 için marka giriniz: ");
        nesne3.marka = reader.nextLine();
        System.out.print("Nesne3 için model giriniz: ");
        nesne3.model = reader.nextLine();
        System.out.print("Nesne3 için renk giriniz: ");
        nesne3.renk = reader.nextLine();
        System.out.print("Nesne3 için hafıza (GB) giriniz: ");
        nesne3.hafiza = reader.nextInt();
        System.out.print("Nesne3 için hız (GHz) giriniz: ");
        nesne3.hiz = reader.nextFloat();
        
        nesne3.bilgileri_yazdir(); 
        System.out.println(nesne3.hafiza_degerlendir());
        
        reader.close();
	}
}
