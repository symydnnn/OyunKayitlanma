package oyun.entities.concretes;

public class Kampanya extends Program{
	private String kampanyaBilgi;
	private int indirimYuzdesi;
	private int indirimKuponuFiyati;
	private int indirimYap�lanMiktar;
	
	
	public String getKampanyaBilgi() {
		return kampanyaBilgi;
	}
	public void setKampanyaBilgi(String kampanyaBilgi) {
		this.kampanyaBilgi = kampanyaBilgi;
	}
	public int getIndirimYuzdesi() {
		return indirimYuzdesi;
	}
	public void setIndirimYuzdesi(int indirimYuzdesi) {
		this.indirimYuzdesi = indirimYuzdesi;
	}
	public int getIndirimKuponuFiyati() {
		return indirimKuponuFiyati;
	}
	public void setIndirimKuponuFiyati(int indirimKuponuFiyati) {
		this.indirimKuponuFiyati = indirimKuponuFiyati;
	}
	public int getIndirimYap�lanMiktar() {
		return indirimYap�lanMiktar;
	}
	public void setIndirimYap�lanMiktar(int indirimYap�lanMiktar) {
		this.indirimYap�lanMiktar = indirimYap�lanMiktar;
	}
	
	
	public Kampanya() {
		super();
	}
	
	public Kampanya(String isim, String idNo, String kampanyaBilgi,int indirimYuzdesi, int indirimKuponuFiyati, int indirimYap�lanMiktar) {
		super(isim, idNo);
	}
	
	
	

}
