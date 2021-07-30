package oyun.business.concretes;

import oyun.entities.concretes.Musteri;

public class MusteriYonetim extends Yonetim {
	
	public void guncelle() {
		System.out.println("Hesap Guncellendi.");
	}
	
	@Override
	public void kaydet(Musteri oyuncu) {
		System.out.println("Musteri Kaydedildi.");
		super.kaydet(oyuncu);
	}

	@Override
	public void sil(Musteri oyuncu) {
		System.out.println("Musteri Silindi.");
		super.sil(oyuncu);
	}

	@Override
	public void listele(Musteri oyuncu) {
		System.out.println("Musteriler Listelendi.");
		super.listele(oyuncu);
	}
	
	
	

}
