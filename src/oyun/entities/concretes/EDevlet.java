package oyun.entities.concretes;


public class EDevlet extends Program {
	private String isim;
	private String tcNo;
	private String soyad;
	private int dogumTarihi;
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

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

	public EDevlet(String isim, String tcNo, String soyad, int dogumTarihi) {
		super();
		this.isim = isim;
		this.tcNo = tcNo;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		
	}

	

}
