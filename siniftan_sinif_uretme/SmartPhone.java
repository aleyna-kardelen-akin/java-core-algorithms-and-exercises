package siniftan_sinif_uretme;

public class SmartPhone {
	
	private int id;
	private static int syc=0;
	public String marka;
	public String model;
	public int hafiza;
	
	public SmartPhone(String marka, String model, int hafiza) {
		
		this.id =++syc;
		this.marka = marka;
		this.model = model;
		this.hafiza = hafiza;
	}
	
	public void bilgileri_yazdir() {
		
		System.out.println("\nID: " + id);
		System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Hafiza: " + hafiza + " GB");
	}
	
	public String hafiza_degerlendir() {
		
		if (hafiza <= 64) return "\nDusuk Hafiza";
		else if (hafiza <= 128) return "\nOrta Hafiza";
        else return "\nYuksek Hafiza";
    }
}
