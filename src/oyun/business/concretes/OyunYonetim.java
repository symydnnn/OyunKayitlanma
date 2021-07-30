package oyun.business.concretes;

import java.time.LocalDate;

import oyun.entities.concretes.Musteri;
import oyun.entities.concretes.Oyun;

public class OyunYonetim extends Yonetim{
	
	public void oyunSec(Musteri oyuncu) {
		System.out.println("Oyun Secildi.");
	}
	

	public void oyunSat�nAl(Musteri oyuncu, Oyun oyun) {
		int tarih = LocalDate.now().getYear();
		int dogumTarih = oyuncu.getDogumTarihi(); 
		int fark = tarih-dogumTarih;
		int s�n�r = oyun.getYasSiniri();
		
		if(fark>=s�n�r) {
			System.out.println("Oyun Sat�n Al�nd�.");
		}else {
			System.out.println("Yas tutars�zd�r. Oyun Sat�n al�namaz.");
		}
	}
	
	public void indir(Musteri oyuncu) {
		System.out.println("Oyun �ndirildi.");
	}
	
	public void oyunIadeEt(Musteri oyuncu) {
		System.out.println("Oyun �ade Edildi.");	
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