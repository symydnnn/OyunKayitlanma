package oyun.entities.concretes;


public class Musteri extends Program{
	private String tcNo;
	private String soyad;
	private int dogumTarihi;
	
	
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public int getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(int dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	
	public Musteri(String isim,String soyad,String tcNo, String idNo,int dogumTarihi) {
		super(isim, idNo);
		this.tcNo = tcNo;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
	}
	
	public Musteri(String isim, String tcNo, String soyad, int dogumTarihi) {
		super(isim,null);
		this.tcNo = tcNo;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
	}


}
