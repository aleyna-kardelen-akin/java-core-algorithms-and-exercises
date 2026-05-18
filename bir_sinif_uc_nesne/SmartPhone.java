package bir_sinif_uc_nesne;

public class SmartPhone {
	
	public String marka;
	public String model;
	public String renk;
	public int hafiza;
	public float hiz;
	
	public SmartPhone(String marka, String model, String renk, int hafiza, float hiz) {
	
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.hafiza = hafiza;
		this.hiz = hiz;
	}

	public void bilgileri_yazdir() {
		
		System.out.println("\nMarka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Renk: " + renk);
        System.out.println("Hafiza: " + hafiza + " GB");
        System.out.println("Hiz: " + hiz + " GHz");
	}
	
	public String hafiza_degerlendir() {
		
		if (hafiza <= 64) return "Dusuk Hafiza";
		else if (hafiza <= 128) return "Orta Hafiza";
        else return "Yuksek Hafiza";
    }
	
}
