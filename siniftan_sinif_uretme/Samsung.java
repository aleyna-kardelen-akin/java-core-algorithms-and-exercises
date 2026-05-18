package siniftan_sinif_uretme;

public class Samsung extends SmartPhone{
	
	public int id;
	public float hiz;
	public int kamera;
	
	public int getId() {
		return id;
	}

	public Samsung(String marka, String model, int hafiza) 
	{
		super(marka, model, hafiza);
	}
	
	public Samsung(String marka, String model, int hafiza, float hiz, int kamera)
	{
		super(marka, model, hafiza);
		this.hiz = hiz;
		this.kamera = kamera;
	}

	@Override
	public void bilgileri_yazdir() 
	{
		super.bilgileri_yazdir();
	}
	
	public void hiz_degerlendir()
	{
		if(hiz>2.5)
		{
			System.out.println("\nHiziniz yeterlidir.");
		}
		else
		{
			System.out.println("\nHiziniz yetersizdir.");
		}
	}
	
	public void kamera_degerlendir()
	{
		if(kamera>64)
		{
			System.out.println("\nKameraniz yeterlidir.");
		}
		else
		{
			System.out.println("\nKameraniz yetersizdir.");
		}
	}	
}
