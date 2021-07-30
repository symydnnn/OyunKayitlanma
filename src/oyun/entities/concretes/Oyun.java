package oyun.entities.concretes;

public class Oyun extends Program {
	
	private int fiyat;
	private int yasSiniri;

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	public int getYasSiniri() {
		return yasSiniri;
	}

	public void setYasSiniri(int yasSiniri) {
		this.yasSiniri = yasSiniri;
	}

	public Oyun() {
		super();
	}
	
	public Oyun(String isim, String idNo, int fiyat,int yasSiniri) {
		super(isim, idNo);
		this.yasSiniri= yasSiniri;
	}
}
