package oyun.entities.concretes;

public class Kampanya extends Program{
	private String kampanyaBilgi;
	private int indirimYuzdesi;
	private int indirimKuponuFiyati;
	private int indirimYapılanMiktar;
	
	
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
	public int getIndirimYapılanMiktar() {
		return indirimYapılanMiktar;
	}
	public void setIndirimYapılanMiktar(int indirimYapılanMiktar) {
		this.indirimYapılanMiktar = indirimYapılanMiktar;
	}
	
	
	public Kampanya() {
		super();
	}
	
	public Kampanya(String isim, String idNo, String kampanyaBilgi,int indirimYuzdesi, int indirimKuponuFiyati, int indirimYapılanMiktar) {
		super(isim, idNo);
	}
	
	
	

}
