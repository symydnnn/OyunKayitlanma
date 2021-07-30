package oyun.entities.concretes;


public class Program{
	private String isim;
	private String idNo;
	
	
	public Program() {
		//super();
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	public Program(String isim, String idNo) {
		this.isim = isim;
		this.idNo = idNo;
	}
	
	
	
	
	

}
