package oyun.core;

import oyun.entities.concretes.EDevlet;
import oyun.entities.concretes.Musteri;
import oyun.entities.concretes.Program;

public class Dogrulama extends Program{

	private EDevlet dogru;
	private Musteri musteri;
	
	public Dogrulama(EDevlet dogru, Musteri musteri) {
		this.dogru = dogru;
		this.musteri=musteri;
	}
	
	public void dogruMu() {
		if(musteri.getTcNo().equals(dogru.getTcNo())) {
		System.out.println("Dogrulanacak ad: "+dogru.getIsim());
		System.out.println("Girilen Ad: "+musteri.getIsim());
		System.out.println("Dogrulanmistir.");	
		}
		else {
			System.out.println("Dogrulama basarisiz.");
		}
	}
	
}
