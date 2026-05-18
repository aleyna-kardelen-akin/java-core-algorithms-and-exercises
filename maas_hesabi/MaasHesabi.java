package maas_hesabi;

public class MaasHesabi {
	
	private int id;
	private String ad_soyad;
	private int yas;
	private int cocuk_sayi;
	private float maas;
	private static int id_arttirici = 1;
	
	public String getAd_soyad() {
		return ad_soyad;
	}

	public void setAd_soyad(String ad_soyad) {
		this.ad_soyad = ad_soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getCocuk_sayi() {
		return cocuk_sayi;
	}

	public void setCocuk_sayi(int cocuk_sayi) {
		this.cocuk_sayi = cocuk_sayi;
	}

	public float getMaas() {
		return maas;
	}

	public void setMaas(float maas) {
		this.maas = maas;
	}

	public MaasHesabi(String ad_soyad, int yas) {
		
		this.id = id_arttirici++;
		this.ad_soyad = ad_soyad;
		this.yas = yas;
	}
	
	public MaasHesabi(String ad_soyad, int yas, int cocuk_sayi, float maas) {
		
		this.id = id_arttirici++;
		this.ad_soyad = ad_soyad;
		this.yas = yas;
		this.cocuk_sayi = cocuk_sayi;
		this.maas = maas;
	}

	public void bilgileri_yazdir() {
		
		System.out.println("\nID: " + id);
        System.out.println("Ad Soyad: " + ad_soyad);
        System.out.println("Yas: " + yas);
        System.out.println("Cocuk Sayisi: " + cocuk_sayi);
        System.out.println("Maas: " + maas + " TL");
	}

	public void maas_hesapla() {
		
		if (maas < 20000.0)  maas *= 1.05; 
        else 
        {
            if (cocuk_sayi > 0)  maas *= (1 + (cocuk_sayi * 0.015)); 
            else if (yas > 40)  maas *= 1.035; 
            else  maas *= 1.025; 
        }
	}

}
