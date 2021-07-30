package oyun.business.concretes;

import java.time.LocalDate;

import oyun.entities.concretes.Musteri;
import oyun.entities.concretes.Oyun;

public class OyunYonetim extends Yonetim{
	
	public void oyunSec(Musteri oyuncu) {
		System.out.println("Oyun Secildi.");
	}
	

	public void oyunSatinAl(Musteri oyuncu, Oyun oyun) {
		int tarih = LocalDate.now().getYear();
		int dogumTarih = oyuncu.getDogumTarihi(); 
		int fark = tarih-dogumTarih;
		int sýnýr = oyun.getYasSiniri();
		
		if(fark>=sýnýr) {
			System.out.println("Oyun Satin Alindi.");
		}else {
			System.out.println("Yas tutarsizdir. Oyun Satin alinamaz.");
		}
	}
	
	public void indir(Musteri oyuncu) {
		System.out.println("Oyun Ýndirildi.");
	}
	
	public void oyunIadeEt(Musteri oyuncu) {
		System.out.println("Oyun Ýade Edildi.");	
	}

	@Override
	public void kaydet(Musteri oyuncu) {
		System.out.println("Oyun Kaydedildi.");
		super.kaydet(oyuncu);
	}

	@Override
	public void sil(Musteri oyuncu) {
		System.out.println("Oyun Silindi.");
		super.sil(oyuncu);
	}

	@Override
	public void listele(Musteri oyuncu) {
		System.out.println("Oyunlar Listelendi.");
		super.listele(oyuncu);
	}
	
	
	

}
