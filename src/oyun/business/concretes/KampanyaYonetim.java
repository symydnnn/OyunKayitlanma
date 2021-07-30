package oyun.business.concretes;

import oyun.entities.concretes.Musteri;

public class KampanyaYonetim extends Yonetim{
	
	@Override
	public void kaydet(Musteri oyuncu) {
		System.out.println("Kampanya Kaydedildi.");
		super.kaydet(oyuncu);
	}

	@Override
	public void sil(Musteri oyuncu) {
		System.out.println("Kampanya Kaldirildi.");
		super.sil(oyuncu);
	}

	@Override
	public void listele(Musteri oyuncu) {
		System.out.println("Kampanyalar Listelendi.");
		super.listele(oyuncu);
	}
	
	

}
